package sortlist;

import java.util.*;

public class Sortlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type any non-number to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}
