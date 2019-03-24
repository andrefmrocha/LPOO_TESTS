import java.util.ArrayList;
import java.util.List;

public abstract class Facility {
    List<User> users;

    Facility(){
        this.users = new ArrayList<>();
    }

    abstract String getName();

    void authorize(User user){
        users.add(user);
    }

    public boolean canEnter(User u1) {
        return this.users.contains(u1);
    }
}
