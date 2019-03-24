import java.util.ArrayList;
import java.util.List;

public class Party  extends  Event{
    List<Event> events = new ArrayList<>();
    Party(String title) {
        super(title);
    }

    Party(String title, String date) {
        super(title, date);
    }

    Party(String title, String date, String description) {
        super(title, date, description);
    }

    Party(Event e) {
        super(e);
    }

    public void addEvent(Event e) {
        this.events.add(e);
        this.attendees.addAll(e.getAttendees());
    }
}
