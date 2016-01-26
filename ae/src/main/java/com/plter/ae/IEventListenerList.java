package com.plter.ae;

/**
 * Created by plter on 1/26/16.
 */
public interface IEventListenerList<E extends Event> {

    void add(EventListener<E> listener);
    void add(EventListener<E> listener, int index);
    void remove(EventListener<E> listener);
    void remove(final String name);
    void remove();
    boolean dispatch(final E event, final Object target);
    boolean dispatch(E event);
}
