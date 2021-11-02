package Generics;

public class GenericList<T> {

    private int size = 0;
    private Object[] array = new Object[size];

    public int size() {
        return size;
    }

    public void add(T value) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals((T) array[i])) {
                return;
            }
        }
        size++;
        if (array.length < size) {
            Object[] newArray = new Object[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size - 1] = value;
    }

    public void put(int index, T value) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Индекс " + index + " больше чем " + (size - 1));
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Отрицательный индекс не допускается");
        }
        array[index] = value;
    }

    public T get(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Индекс" + index + "больше чем" + (size - 1));
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Отрицательный индекс не допускается");
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException("Индекс " + index + " больше чем " + (size - 1));
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Отрицательный индекс не допускается");
        }
        size--;
        Object[] newArray = new Object[size];
        if (index > 0) {
            System.arraycopy(array, 0, newArray, 0, index);
        }
        System.arraycopy(array, (index + 1), newArray, index, (array.length - (index + 1)));

        array = newArray;
    }
}
