package dz_sem4;

import java.util.Arrays;

public class DataContainer<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public DataContainer() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
