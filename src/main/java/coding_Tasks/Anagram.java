package coding_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "обезьянство";
        String str2 = "мечеть";
        String str3 = "место";
        String[] array1 = str1.split("");
        String[] array2 = str2.split("");
        String[] array3 = str3.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(array1));
        List<String> list2 = new ArrayList<>(Arrays.asList(array2));
        List<String> list3 = new ArrayList<>(Arrays.asList(array3));
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        if (str1.equals(str2)) {
            System.out.println("str1 & str2 - Два одинаковых слова");
        } else {
            boolean isEqual = list1.equals(list2);
            System.out.println("str1 = str2 = " + isEqual + "\n");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 & str3 - Два одинаковых слова");
        } else {
            boolean isEqual = list1.equals(list3);
            System.out.println("str1 = str3 = " + isEqual + "\n");
        }
        if (str2.equals(str3)) {
            System.out.println("str2 & str3 Два одинаковых слова");
        } else {
            boolean isEqual = list2.equals(list3);
            System.out.println("str2 = str3 = " + isEqual);
        }
    }
}
