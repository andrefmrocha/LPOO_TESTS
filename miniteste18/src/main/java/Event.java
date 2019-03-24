import java.util.ArrayList;
import java.util.List;

public class Event {
    private String title;
    private String date;
    private String description;
    protected List<Person> attendees = new ArrayList<>();

    Event(String title){
        this.title = title;
        this.date = "";
        this.description = "";
    }

    Event(String title, String date){
        this.title = title;
        this.date = date;
        this.description = "";
    }

    Event(String title, String date, String description){
        this.title = title;
        this.date = date;
        this.description = description;
    }

    Event(Event e){
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getTitle() + " is a " + this.getDescription() + " and will be held at " + this.getDate() + ".";
    }


    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(this == o)
            return true;
        if(this.getClass() != o.getClass())
            return false;

        Event ev = (Event) o;
        return this.getTitle().equals(ev.title) && this.getDate().equals(ev.getDate())
                && this.getDescription().equals(ev.getDescription());
    }

    public void addPerson(Person attendee) {
//        for(Person p: this.attendees){
//            if(p.equals(attendee))
//                return;
//        }
        if(!this.attendees.contains(attendee))
            this.attendees.add(attendee);
    }

    public int getAudienceCount() {
        return this.attendees.size();
    }

    List<Person> getAttendees(){
        return this.attendees;
    }
}
