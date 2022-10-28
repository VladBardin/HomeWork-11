package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static void main(String[] args) {
        String[] names = {"Ivan", "John", "Peter", "Andros", "Ivo", "Bayrak", "Liao"};
        List<String> nameList = Arrays.stream(names)
                .map(x -> x.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(nameList);
    }
}
