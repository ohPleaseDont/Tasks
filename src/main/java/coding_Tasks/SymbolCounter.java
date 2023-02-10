package coding_Tasks;
//Про английскую раскладку я не особо понял "в" в англ. языке не встречается
public class SymbolCounter {
    public static void main(String[] args) {
        String phrase = "Работать нужно не 12 часов, а головой!";
        char[] array = phrase.toCharArray();
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (array[i] == 'в') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
