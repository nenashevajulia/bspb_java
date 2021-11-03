package generics;

public class Main {
    public static void main(String[] args) {
        GenericList<String> array = new GenericList<>();
        array.add("Значение 1");
        array.add("Значение 2");
        array.add("Значение 3");
        array.add("Значение 4");
        array.add("Значение 5");
        array.add("Значение 6");
        array.add("Значение 3");
        System.out.println("Размер массива " + array.size());
        System.out.println(array.get(0));
        array.remove(0);
        array.put(2, "Значение 8");
        System.out.println("Размер массива " + array.size());

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(4));

    }
}
