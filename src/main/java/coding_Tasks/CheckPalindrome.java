package coding_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Аргентина манит негра";
        String strLowerCase = str.toLowerCase(Locale.ROOT);
        String strReversed = new StringBuffer(strLowerCase).reverse().toString();
        String[] array = strLowerCase.split("");
        String[] arrayReversed = strReversed.split("");
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.removeIf(n -> n.equals(" "));
        List<String> listReversed = new ArrayList<>(Arrays.asList(arrayReversed));
        listReversed.removeIf(n -> n.equals(" "));
        boolean isEqual = list.equals(listReversed);
        System.out.println(isEqual);
        //вывод массивов
        array = list.toArray(new String[list.size()]);
        arrayReversed = listReversed.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReversed));
    }
}