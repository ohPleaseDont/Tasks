package coding_Tasks;

import java.util.Scanner;

public class WorkWithOneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное" + "\n");
        }
        if (number % 10 == 0) {
            int numberDiv = number / 10;
            System.out.println(numberDiv + "\n");
        }
        if (number % 3 == 0) {
            double result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println(result);
        }
    }
}
