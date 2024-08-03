import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double)sum/ arr.length);

    }
}
