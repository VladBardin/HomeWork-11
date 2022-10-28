package Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFour {

    public static void main(String[] args) {
        MyRandom random = new MyRandom(25214903917L, 11, Math.pow(2, 48));
        Stream<Long> integerStream = Stream.iterate(1L, (seed) -> random.seed(seed).next());
        integerStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
