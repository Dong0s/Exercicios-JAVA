package exercicios;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id = ler.nextInt();
		int A = 0;
		int G = 0;
		int D = 0;
		int cont = 0;
		while (cont == 0) {
			if (id == 1) {
				A++;
				id = ler.nextInt();
			} else if (id == 2) {
				G++;
				id = ler.nextInt();
			} else if (id == 3) {
				D++;
				id = ler.nextInt();
			} else if (id == 4) {
				System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", A, G, D);

				break;
			}else  {
				id = ler.nextInt();
			}
		}

		ler.close();
	}
}
