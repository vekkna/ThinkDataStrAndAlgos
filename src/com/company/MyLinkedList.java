package com.company;

public class MyLinkedList<E> {

    private MyNode<E> head;
    private int size = 0;

    public void add(E el) {
        if (size == 0) {
            head = new MyNode<E>(el);
        } else {
            MyNode current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }
            current.setNext(current);
            size += 1;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        var current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void addAt(int index) {

    }

    public int indexOf(E el) {
        int i = 0;
        var current = head;
        while (current != null) {
            if (current.getData() == el) return i;
            current = current.getNext();
            i += 1;
        }
        return -1;
    }
}