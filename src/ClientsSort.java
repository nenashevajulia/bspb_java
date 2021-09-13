import java.util.Arrays;

public class ClientsSort {
    public static void main(String[] args) {
        String[][] clients = {
                {"Казакова Евгения Билаловна", "21", "ж"},
                {"Константинова Констанция Константинова", "39", "ж"},
                {"Кулебяка Игорь Олегович", "21", "м"},
                {"Челотарова Арина Александровна", "18", "ж"},
                {"Зайцева Вера Кирилловна", "48", "ж"},
                {"Федоров Ибрагим Данилович", "31", "м"},
                {"Черная Наталья Захаровна", "45", "ж"},
                {"Ильин Лев Владимирович", "47", "м"},
                {"Сорокин Борис Макарович", "64", "м"},
                {"Чернышев Артур Даниилович", "32", "м"}
        };
        int resultLength = 0;

        for (String[] client : clients) {
            if (client[2] == "ж") {
                resultLength++;
            }
        }

        String[][] result = new String[resultLength][];
        int j = 0;

        for (String[] client : clients) {
            if (client[2] == "ж") {
                result[j] = client;
                j++;
            }
        }

        for (int a = 0; a < result.length; a++) {
            for (int b = 0; b < result.length; b++) {
                if (Integer.parseInt(result[a][1]) < Integer.parseInt(result[b][1])) {
                    String[] temp = result[b];
                    result[b] = result[a];
                    result[a] = temp;
                }
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}
