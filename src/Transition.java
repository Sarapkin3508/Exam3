import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transition extends Thread{
    private int eventId;
private Events events;
//private Map<Integer, Events> eventsAll = events.eventsMap();
public Map<Integer, Transition> transitionMap = new HashMap<>();
private int firstId;
private int secondId;

     public Transition(int eventId, Events events, int firstId, int secondId){
         this.eventId = eventId;
         this.events = events;
         this.firstId = firstId;
         this.secondId = secondId;

     }

/*
    public class MapTrans{
    transitionMap.put();
        }

 */

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public int getFirstId() {
        return firstId;
    }

    public void setFirstId(int firstId) {
        this.firstId = firstId;
    }

    public int getSecondId() {
        return secondId;
    }

    public void setSecondId(int secondId) {
        this.secondId = secondId;
    }

/*

    @Override
    public void run() {
        Map<Integer, Events> eventsAll = events.eventsMap();

    }

 */
}
