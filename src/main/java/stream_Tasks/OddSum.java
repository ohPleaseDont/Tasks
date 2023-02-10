package stream_Tasks;

import java.util.Arrays;
import java.util.Collection;

public class OddSum {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 5, -3, 7, 10);
        int oddSum = collection.stream().filter(x -> x % 2 != 0).mapToInt(y->y).sum();
        System.out.println(oddSum);
    }
}