package com.company;

public class MyArrayList<E> {

    private E[] data = (E[]) new Object[10];
    private int size = 10;

    private Boolean mustGrow() {
        return size >= data.length;
    }

    private void grow() {
        var newData = (E[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        this.data = newData;
    }

    public void add(E el) {
        if (mustGrow()) grow();
        data[size] = el;
        size += 1;
    }

    public void addAt(E el, int index) {
        if (mustGrow()) grow();
        for (int i = size - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = el;
        size += 1;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public E set(E el, int index) {
        E old = get(index);
        data[index] = el;
        return old;
    }

    public void removeAt(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size -= 1;
    }
}