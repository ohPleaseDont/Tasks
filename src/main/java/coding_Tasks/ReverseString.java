package coding_Tasks;

public class ReverseString {
    public static void main (String[] args) {

        String str= "Никогда не ошибается тот, кто ничего не делает", nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println(nstr);
    }
}