import java.util.*;


public class Main {
    private  static  final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
    public static void main(String[] args) {
     task1();
     task2();
     task3();
     task4();


    }

    private static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2() {
        System.out.println();
        Set<Integer> evenNumbers = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        for (Integer num : evenNumbers) {
            System.out.println(num);
        }
    }

    private static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    private static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size()-uniqueWords.size());
    }

}