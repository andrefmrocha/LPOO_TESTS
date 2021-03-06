
public abstract class Person extends User implements Comparable {
    private final String name;
    private final int age;

    Person(String name, int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(this == o)
            return true;

        if(Speaker.class != o.getClass() && Attendee.class != o.getClass())
            return false;

        Person p = (Person) o;
        return this.getName().equals(p.getName());
    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Person) o).getName());
    }
}
