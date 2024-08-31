import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("cat", "dog", "dog", "fish", "bird", "cat", "horse", "mouse", "horse", "human"));

        System.out.println("Задание 1");
        for (int i : numbers) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Задание 2");
        Collections.sort(numbers);
        int numberMin = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numberMin < numbers.get(i) && numbers.get(i) % 2 == 0) {
                numberMin = numbers.get(i);
                System.out.print(numbers.get(i) + " ");
            }
        }

        System.out.println();

        System.out.println("Задание 3");
        Set<String> wordWithoutRepeat = new HashSet<>(words);
        System.out.println("\n" + words);
        System.out.println(wordWithoutRepeat);
        System.out.println();

        System.out.println("Задание 4");
        System.out.println();
        for (String temp : wordWithoutRepeat) {
            int count = 0;
            for (String temp2 : words) {
                if (temp.equals(temp2)) {
                    count++;
                }
            }
            System.out.println(temp + ": " + count);
        }
    }
}