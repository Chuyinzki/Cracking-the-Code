import solutions.Chapter1;

import java.util.AbstractMap;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String testId = "1_7";
        switch (testId) {
            case "1_1":
                String[] strings = {"yolo", "homie", "github", "google", "jumanji", "", "f", "koala", "8iekd"};
                for (String string : strings) {
                    System.out.println(String.format("String \"%s\" is%s unique", string, Chapter1.hasUniqueChars(string) ? "" : " not"));
                    System.out.println(String.format("String \"%s\" is%s unique", string, Chapter1.hasUniqueChars2(string) ? "" : " not"));
                    System.out.println(String.format("String \"%s\" is%s unique", string, Chapter1.hasUniqueChars3(string) ? "" : " not"));
                }
                break;
            case "1_3":
                String[][] strings2 = {{"yolo", "looy"}, {"homie","breh"}, {"github", "google"}, {"", ""}};
                for (String[] stringArr : strings2) {
                    System.out.println(String.format("Strings \"%s\" and \"%s\" are%s permutations", stringArr[0], stringArr[1],
                            Chapter1.isPermutation(stringArr[0], stringArr[1]) ? "" : " not"));
                    System.out.println(String.format("Strings \"%s\" and \"%s\" are%s permutations", stringArr[0], stringArr[1],
                            Chapter1.isPermutation2(stringArr[0], stringArr[1]) ? "" : " not"));
                }
                break;
            case "1_4":
                AbstractMap.SimpleImmutableEntry[] pairs = {new AbstractMap.SimpleImmutableEntry<>("bla h  ", 5),
                new AbstractMap.SimpleImmutableEntry<>("Mr John Smith    ", 13)};
                for(AbstractMap.SimpleImmutableEntry pair : pairs)
                    System.out.println(String.format("\"%s\" turns to \"%s\"", pair.getKey(),
                            Chapter1.removeSpaces((String)pair.getKey(), (int)pair.getValue())));
                break;
            case "1_5":
                String[] strings3 = {"aabcccccaaa", "yolo", "", " ", "     "};
                for(String string: strings3)
                    System.out.println(String.format("\"%s\" compresses to \"%s\"", string, Chapter1.compress(string)));
                break;
            case "1_6":
                String[][] pic0 = {
                        {"01", "02"},
                        {"03", "04"}
                };
                String[][] pic1 = {
                        {"01", "02", "03"},
                        {"04", "05", "06"},
                        {"07", "08", "09"}
                };
                String[][] pic2 = {
                        {"01", "02", "03", "04"},
                        {"05", "06", "07", "08"},
                        {"09", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };
                String[][] pic3 = {
                        {"01", "02", "03", "04", "05"},
                        {"06", "07", "08", "09", "10"},
                        {"11", "12", "13", "14", "15"},
                        {"16", "17", "18", "19", "20"},
                        {"21", "22", "23", "24", "25"},
                };
                ArrayList<String[][]> pics = new ArrayList<>();
                pics.add(pic0);
                pics.add(pic1);
                pics.add(pic2);
                pics.add(pic3);
                for(String[][] pic : pics){
                    System.out.println("Original: ");
                    Chapter1.printPic(pic);
                    System.out.println("Flipped: ");
                    Chapter1.printPic(Chapter1.rotate90(pic));
                }
                break;
            case "1_7":
                int[][] ints0 = {
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 0, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 0, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                };

                System.out.println("Original: ");
                Chapter1.printInts(ints0);
                System.out.println("Zeroed: ");
                Chapter1.printInts(Chapter1.zeroOut2(ints0));
        }
    }
}
