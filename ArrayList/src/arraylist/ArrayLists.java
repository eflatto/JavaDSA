package arraylist;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class ArrayLists<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ArrayLists() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) array[index];
    }

    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayLists<Integer> list = new ArrayLists<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size of list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
    }
}
