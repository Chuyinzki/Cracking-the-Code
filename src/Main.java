import solutions.Problem1_1;
import solutions.Problem1_3;

public class Main {

    public static void main(String[] args) {
        String testId = "1_3";
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
        }
    }
}
