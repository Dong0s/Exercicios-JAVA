package exercicios;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota = 0;
		double media = 0;
		int cont = 0;

		while (cont < 2) {
			nota = ler.nextDouble();
			if (nota > 10 || nota <= 0) {
				System.out.println("nota invalida");
				
			}else {
				cont++;
				media += nota;
			}
			

		}
		System.out.printf("media = %.2f%n",(media/2));
		ler.close();
	}
}
