public class User {
    private String name;

    User(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(o.getClass() != this.getClass())
            return false;
        User usr = (User) o;

        return this.getName().equals(usr.getName());
    }
}
