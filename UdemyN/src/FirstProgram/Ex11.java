package FirstProgram;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario = ler.nextDouble();
		double reajuste;
		double salariofinal;
		if (salario <= 400) {
			reajuste = salario * 0.15;
			salariofinal = salario + reajuste;

			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", salariofinal, reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salario <= 800) {
			reajuste = salario * 0.12;
			salariofinal = salario + reajuste;

			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", salariofinal, reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salario <= 1200) {
			reajuste = salario * 0.10;
			salariofinal = salario + reajuste;

			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", salariofinal, reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salario <= 2000) {
			reajuste = salario * 0.07;
			salariofinal = salario + reajuste;

			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", salariofinal, reajuste);
			System.out.println("Em percentual: 7 %");
		} else {
			reajuste = salario * 0.04;
			salariofinal = salario + reajuste;

			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", salariofinal, reajuste);
			System.out.println("Em percentual: 4 %");
		}
		ler.close();

	}
}
