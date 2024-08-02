package exercicios;
import java.util.Scanner;
public class Ex10 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        int X = scanner.nextInt();
        if (X == 0) {
            break;
        }
        int sum = 0;
        int count = 0;
        while (count < 5) {
            if (X % 2 == 0) {
                sum += X;
                count++;
            }
            X++;
        }
        System.out.println(sum);
    }
    scanner.close();
}
}
