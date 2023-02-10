//package stream_Tasks;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class OddAndEven {
//    public static void main(String[] args) {
//        Collection<Integer> collection = Arrays.asList(1, 5, -3, 7, 10);
//        ArrayList<Integer> kostil = new ArrayList<>(Arrays.asList());
//        Stream<Integer> o = kostil.stream();
//        Stream<Integer> op1 = collection.stream().forEach(x -> {
//            if (x % 2 == 0) {
//                Stream<Integer> op2 = collection.stream().map(y -> y + 100).collect(Collectors.toCollection(() -> o));
//            } else {
//                Stream<Integer> op3 = collection.stream().map(y -> y * 100).collect(Collectors.toCollection(() -> o));
//            }
//        });
//        System.out.println(Arrays.toString(o.toArray()));
//    }
//}