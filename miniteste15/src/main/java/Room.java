public class Room extends Facility{
    private Building building;
    private String name;
    private int floor;
    private int capacity;

    Room(Building building, String name, int floor) throws DuplicateRoomException {
        if(floor > building.getMaxFloor())
            throw new IllegalArgumentException();
        this.building = building;
        this.name = name;
        this.floor = floor;
        building.addRoom(this);
    }

    Room(Building building, String name, int floor, int capacity) throws DuplicateRoomException {
        if(floor > building.getMaxFloor())
            throw new IllegalArgumentException();
        this.capacity = capacity;
        this.building = building;
        this.name = name;
        this.floor = floor;
        this.building.addRoom(this);
    }

    public Building getBuilding() {
        return building;
    }

    public String getNumber() {
        return name;
    }

    public String getName(){
        return this.building.getName() + this.getNumber();
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Room(" + this.building.getName() + "," + this.name + ")";
    }

    @Override
    void authorize(User user){
        users.add(user);
        this.building.authorize(user);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(this == o)
            return true;
        if(this.getClass() != o.getClass())
            return false;
        Room room = (Room) o;
        return room.getName().equals(this.getName());
    }
}
