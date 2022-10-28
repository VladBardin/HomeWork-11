package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskThree {
    public static void main(String[] args) {
        String[] names = {"1, 2, 0", "4, 5"};
        List<String> result = Arrays.stream(names)
                .map(nameLine -> Arrays.asList(nameLine.split(", ")))
                .flatMap(l -> l.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
