package com.collections_homework;

public interface ILinkedList<E> extends Iterable<E> {
    void add(E element);
    void add(int index,E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int indexOf);
    E set(int inedx, E element);
    int size();
    String toString();

}
