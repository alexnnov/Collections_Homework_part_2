package com.collections_homework;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>{

    public class Node<E> {

        private E element;
        private Node next;
        private Node prev;

        public Node(E element){
            this.element = element;
        }
        public Node(){};
        public void setNext(Node next){
            this.next = next;
        }
        public void setPrev(Node prev){ this.prev = prev; }
        public String toString(){ return element.toString(); }

    }




    private Node<E> first;
    private int size;


    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            Node<E> currentNode = first;

            @Override
            public boolean hasNext() {
                return currentNode.next==null;
            }

            @Override
            public E next() {
                currentNode = currentNode.next;
                return currentNode.element;
            }
            @Override
            public void remove(){

            }


        };
        return it;
    }

    public String toString(){
        String res="{";
        Node current=first;
        for(int i=0;i<size;i++){
            res=res+"[";
            res=res+current.toString();
            res=res+"]";
            current=current.next;
        }
        res=res+"}";
        return res;
    }

    public MyLinkedList(){
        first = null;
        size = 0;
    }

    public void add(E element){
        Node newNode = new Node(element);
        newNode.setNext(first);
        if(first!=null) first.setPrev(newNode);
        first = newNode;
        size++;
    }

    public void add(int index, E element){
        Node<E> newNode = new Node<E>(element);
        newNode.next=first;
        for(int i=0;i<index;i++){
           newNode.next=newNode.next.next;
           newNode.prev=newNode.next.prev;
           newNode.prev.next=newNode;
           newNode.next.prev=newNode;
        }
        size++;

    }

    public E get(int index){
        Node<E> newNode = first;
        for(int i=0;i<index;i++){
            if(newNode.next!=null){
            newNode=newNode.next;
            }
        }
        return  newNode.element;


    }

    public int indexOf(E elem) {
        int index = 0;
        Node current = first;
        while (true) {
            if (index >= size) return 0;
            if (current.element == elem) {
                return index;
            }
            current = current.next;
            index++;
        }
    }


    public E remove(int index){
        Node<E> newNode = first;
        if(index==0){
            first=newNode.next;
        }
        else {
            for (int i = 0; i < index; i++) {
                if (newNode.next != null) {
                    newNode = newNode.next;
                }
            }

            newNode.next.prev = newNode.prev;
            newNode.prev.next = newNode.next;
        }
        size--;
        return newNode.element;


    }

    public Object[] toArray(){
        Object[] eArray = new Object[size];
        Node<E> current=first;
        for (int i=0;i<size;i++) {

            eArray[i]=(Object) current.element;
            current=current.next;
        }
        return eArray;
    }

    public <E> E[] toArray(Class<E> cl){
        Node current=first;
        E[] result = (E[]) java.lang.reflect.Array.newInstance(cl);
        for(int i=0;i<size;i++){
            result[i]=(E)current.element;
            current=current.next;
        }
        return result;
    }


    public E set(int index, E element){
        Node<E> newNode = first;
        for(int i=0;i<index;i++){
            if(newNode.next!=null){
                newNode=newNode.next;
            }
        }
        newNode.element = element;
        return newNode.element;
    }

    public void clear(){
        first = null;
        size = 0;
    }
    public int size(){
        return size;
    }





}
