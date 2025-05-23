package events;

import java.util.Date;

public class Lecture extends Event {
    private String speaker;

    public Lecture(String title, Date date, String local, int maxCapacity, String description, int type, String speaker){
        super(title, date, local, maxCapacity, description, type);
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setPalestrante(String speaker) {
        this.speaker = speaker;
    }
    
}
