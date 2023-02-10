package stream_Tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class NegativeToPositive {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 5, -3, 7);
        Stream<Integer> abs = collection.stream().map(x -> Math.abs(x));
        System.out.println(Arrays.toString(abs.toArray()));
    }
}
