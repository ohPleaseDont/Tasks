package coding_Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер числа Фибонначи(>=2)");
        int number = scanner.nextInt();
        if (number >= 2) {
            long a = 0;
            long b = 1;
            for (int i = 2; i <= number; ++i) {
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println(b);
        } else if (number == 1) {
            System.out.println("0");
        } else {
            System.out.println("Пожалуйста, не пытайтесь меня ломать");
        }
    }
}
