package stream_Tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Sirnames {
    public static void main (String[] args){
        Collection<String> collection = Arrays.asList("Авдеев", "Петров", "Аляев");
        Stream<String> filter = collection.stream().filter(x->x.startsWith("А"));
        System.out.println(Arrays.toString(filter.toArray()));
    }
}
