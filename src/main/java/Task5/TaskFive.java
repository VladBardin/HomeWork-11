package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorOne = first.iterator();
        Iterator<T> iteratorTwo = second.iterator();
        List<T> result = new ArrayList<>();
        while (iteratorOne.hasNext() && iteratorTwo.hasNext()) {
            result.add(iteratorOne.next());
            result.add(iteratorTwo.next());
        }
        return result.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream2 = Stream.of(10, 20, 30, 40, 50, 60);
        zip(stream1, stream2)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
