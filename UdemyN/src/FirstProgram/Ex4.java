package FirstProgram;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();

		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < a && b < c) {
			System.out.println("MENOR = " + b);
		} else if (c < a && c < b) {
			System.out.println("MENOR = " + c);
		}
		ler.close();
	}
}
