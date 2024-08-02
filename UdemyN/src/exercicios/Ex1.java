package exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		
		int soma = 0;
		while(x != 0 ) {
			soma += x;
			x = ler.nextInt();
		}
		System.out.println(soma);
		ler.close();

	}
}
