package coding_Tasks;

public class ChangeSymbol {
    public static void main(String[] args) {
        String phrase = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        char[] array = phrase.toCharArray();
        for (int i = 0; i < phrase.length(); i++) {
            if (array[i] == '*') {
                array[i] = 'а';
            }
        }
        String after = new String(array);
        System.out.println(after);
    }
}
