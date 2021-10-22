package com.example.singlylinkedlist;

public interface LinkedList<E> {

    void addFirst(E element);
    void addLast(E element);

    E pollFirst();
    E pollLast();

    E peakFirst();
    E peakLast();

    //it is good to have a clear in a collection
    void clear();

    boolean contains(E element);

}
