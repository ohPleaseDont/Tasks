package coding_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteSymbol {
    public static void main(String[] args) {
        String phrase = "Работать нужно не 12 часов, а головой!";
        String[] array = phrase.split("");
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove("!");
        array = list.toArray(new String[list.size()]);
        String arrayString = String.join("", array);
        System.out.println(arrayString);
    }
}
