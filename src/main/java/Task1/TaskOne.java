package Task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        String[] names = {"Ivan", "John", "Peter", "Andros", "Ivo", "Bayrak", "Liao"};
        List<String> nameList = IntStream.range(0, names.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> i + 1 + ". " + names[i])
                .collect(Collectors.toList());
        System.out.println(nameList);
    }
}
