import solutions.Problem1_1;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"yolo", "homie", "github", "google", "jumanji", "", "f", "koala", "8iekd"};
        for(String string : strings) {
            System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars(string) ? "" : " not"));
            System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars2(string) ? "" : " not"));
            System.out.println(String.format("String \"%s\" is%s unique", string, Problem1_1.hasUniqueChars3(string) ? "" : " not"));
        }
    }
}
