package com.plter.ae;

import android.app.Application;

/**
 * Created by plter on 1/26/16.
 */
public class AEApplication extends Application implements IEventListenerList<Event> {
    @Override
    public void add(EventListener<Event> listener) {
        eList.add(listener);
    }

    @Override
    public void add(EventListener<Event> listener, int index) {
        eList.add(listener, index);
    }

    @Override
    public void remove(EventListener<Event> listener) {
        eList.remove(listener);
    }

    @Override
    public void remove(String name) {
        eList.remove(name);
    }

    @Override
    public void remove() {
        eList.remove();
    }

    @Override
    public boolean dispatch(Event event, Object target) {
        return eList.dispatch(event, target);
    }

    @Override
    public boolean dispatch(Event event) {
        return eList.dispatch(event);
    }


    private final EventListenerList<Event> eList = new EventListenerList<>();
}
