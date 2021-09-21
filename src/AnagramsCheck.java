import java.util.Arrays;

public class AnagramsCheck {
    public static void main(String[] args) {
        String firstStr = "AnaGRa m-s!";
        String secondStr = "Ma-G NAs ra!";

        String firstVar = firstStr.toLowerCase().replace(" ", "");
        String secondVar = secondStr.toLowerCase().replace(" ", "");

        if (firstVar.length() != secondVar.length()) {
            System.out.println("Слова " + firstStr + " и " + secondStr + " - не анаграмма");
        } else {
            char[] firstArray = firstVar.toCharArray();
            char[] secondArray = secondVar.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            if (Arrays.equals(firstArray, secondArray)) {
                System.out.println("Слова " + firstStr + " и " + secondStr + " - анаграмма");
            } else {
                System.out.println("Слова " + firstStr + " и " + secondStr + " - не анаграмма");
            }


        }


    }
}
