import solutions.Problem1_1;
import solutions.Problem1_3;
import solutions.Problem1_4;

import java.util.AbstractMap;

public class Main {

    public static void main(String[] args) {
        String testId = "1_4";
        switch (testId) {
            case "1_1":
                String[] strings = {"yolo", "homie", "github", "google", "jumanji", "", "f", "koala", "8iekd"};
                for (String string : strings) {
                    System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars(string) ? "" : " not"));
                    System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars2(string) ? "" : " not"));
                    System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars3(string) ? "" : " not"));
                }
                break;
            case "1_3":
                String[][] strings2 = {{"yolo", "looy"}, {"homie","breh"}, {"github", "google"}, {"", ""}};
                for (String[] stringArr : strings2) {
                    System.out.println(String.format("Strings \"%s\" and \"%s\" are%s permutations", stringArr[0], stringArr[1],
                            Problem1_3.isPermutation(stringArr[0], stringArr[1]) ? "" : " not"));
                    System.out.println(String.format("Strings \"%s\" and \"%s\" are%s permutations", stringArr[0], stringArr[1],
                            Problem1_3.isPermutation2(stringArr[0], stringArr[1]) ? "" : " not"));
                }
                break;
            case "1_4":
                AbstractMap.SimpleImmutableEntry[] pairs = {new AbstractMap.SimpleImmutableEntry<>("bla h  ", 5),
                new AbstractMap.SimpleImmutableEntry<>("Mr John Smith    ", 13)};
                for(AbstractMap.SimpleImmutableEntry pair : pairs)
                    System.out.println(String.format("\"%s\" turns to \"%s\"", pair.getKey(),
                            Problem1_4.removeSpaces((String)pair.getKey(), (int)pair.getValue())));
        }
    }
}
