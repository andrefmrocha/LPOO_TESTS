import java.util.ArrayList;
import java.util.List;

public class Building extends Facility{
    private String name;
    private int minFloor;
    private int maxFloor;
    private int capacity;
    List<Room> rooms;

    Building(String name, int minFloor, int maxFloor){
        super();
        if(minFloor > maxFloor)
            throw new IllegalArgumentException();
        this.name = name;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.rooms = new ArrayList<>();
    }

    Building(String name, int minFloor, int maxFloor, int capacity){
        this.name = name;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addRoom(Room room) throws DuplicateRoomException {
        if(this.rooms.contains(room))
            throw new DuplicateRoomException();
        this.capacity+= room.getCapacity();
        this.rooms.add(room);
    }

    @Override
    public String toString() {
        return "Building(" + this.getName() + ")";
    }
}
