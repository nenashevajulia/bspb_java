package lesson_7_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add(0, "Значение 0");
        dictionary.add(1, "Значение 1");
        dictionary.add("Два", "Значение 2");
        dictionary.add(6_795_283_826L, "Значение 3");
        dictionary.add(true, "Значение 4");
        dictionary.add(0, "Замена значения 0");
        System.out.println(dictionary.get(0));
        System.out.println(dictionary.get("ноль"));
        System.out.println(dictionary.get(6_795_283_826L));
        dictionary.remove(true);
        dictionary.remove("ноль");
        System.out.println(dictionary.get(true));

    }

}
