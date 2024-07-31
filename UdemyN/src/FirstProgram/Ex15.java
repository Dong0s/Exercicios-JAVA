package FirstProgram;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		double BC2, aux, A2;

		if (B > A) {
			aux = A;
			A = B;
			B = aux;
		}
		if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}
		A2 = Math.pow(A, 2);
		BC2 = Math.pow(B, 2) + Math.pow(C, 2);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else{
			if(A2 > BC2) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (A2 < BC2) {
			System.out.println("TRIANGULO ACUTANGULO");
		} else{
			System.out.println("TRIANGULO RETANGULO");
		}if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		ler.close();
	}
}
}
