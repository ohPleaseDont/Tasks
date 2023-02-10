package coding_Tasks;

import java.util.HashMap;

public class HashWordsCounter {
    public static void main(String[] args) {

        String phrase = "Упади семь раз и восемь раз поднимись";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] ignored = phrase.split(" ");

        for (String ignore : ignored) {
            Integer count = map.get(ignore);
            if (count == null) {
                count = 0;
            }
            map.put(ignore, count + 1);
        }
        for (int i = 0; i < ignored.length; i++) {
            System.out.println(ignored[i]);
        }
        System.out.println(map);
    }
}

