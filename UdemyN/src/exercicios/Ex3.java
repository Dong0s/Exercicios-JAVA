package exercicios;
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int x = ler.nextInt();
	int y = ler.nextInt();

	while (x != y) {
		if (x < y) {
			System.out.println("Crescente");
		} else {
		System.out.println("Decrescente");
		}
		x = ler.nextInt();
		y = ler.nextInt();
	}

	ler.close();
}
}
