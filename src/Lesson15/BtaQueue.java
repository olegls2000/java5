package Lesson15;

import java.util.*;

public class BtaQueue<E> implements Queue<E> {

    //private Object [] container = {new Object, new Object};
    private Object[] container = {};

    @Override
    public int size() {
        return container.length;
    }

    @Override
    public boolean isEmpty() {
        return container.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object element : container) {
            if (o.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return container;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {

        int indexToRemove = -1;
        for (int i = 0; i < container.length; i++) {
            if (container[i].equals(o)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove < 0){
            return false;
        }
        int newSize = container.length-1;
        Object[]tempContainer = new Object[newSize];
        for (int i = 0; i < indexToRemove; i++) {
            tempContainer[i] = container[i];
        }
        for (int i = indexToRemove + 1; i < container.length-1; i++) {
            tempContainer[i] = container[i +1];
        }
            return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        container = new Object[0];
    }

    @Override
    public boolean offer(E e) {

        int currentSize = container.length;
        int newSize = currentSize + 1;
        Object[] tempContainer = new Object[newSize];
        for (int i = 0; i < container.length; i++) {
            tempContainer[i] = container[i];
        }
        tempContainer[currentSize] = e;
        container = tempContainer;
        return true;
    }

    @Override
    public E remove() {
        return poll();
    }

    @Override
    public E poll() { //TODO.... remove first element in array

        return null;
    }

    @Override
    public E element() {
        return peek();
    }

    @Override
    public E peek() {
        //TODO.... show element in array
        return null;
    }
}
