import java.io.IOException;
import java.util.Scanner;

public class Task14
{
    static String task_14(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return task_14(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println( "\n14) Цифры числа слева направо. Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.");
        System.out.println("  Введи числа: ");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.print("  Результат: " + task_14(a));
    }
}
