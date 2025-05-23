package services;

import events.*;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<Event> event;

    public EventManager(){
        this.event = new ArrayList<>();
    }

    public void Create(){

    }
    public List<Event> display(){
        return this.event;
    }
}
