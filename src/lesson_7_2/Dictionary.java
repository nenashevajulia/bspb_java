package lesson_7_2;

public class Dictionary<T> {

    private int size = 1;
    private Object[][] array = new Object[size][2];

    public int size() {
        return size;
    }

    public void add(Object key, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                array[i][1] = value;
                break;
            }
        }
        size++;
        for (int i = 0; i < size; i++) {
            if (array[i][0] == null) {
                Object[][] newArray = new Object[size][2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
                array[size - 1][0] = key;
                array[size - 1][1] = value;
            }
        }
    }

    public T get(Object key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                return (T) array[i][1];
            }
        }
        return null;
    }

    public void remove(Object key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equals(key)) {
                size--;
                Object[][] newArray = new Object[size][];
                if (i == 0) {
                    System.arraycopy(array, 1, newArray, 0, array.length - 1);
                } else {
                    System.arraycopy(array, 0, newArray, 0, i);
                    System.arraycopy(array, (i + 1), newArray, i, (array.length - (i + 1)));
                }
                array = newArray;
            }
        }
    }
}

