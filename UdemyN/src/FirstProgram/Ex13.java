package FirstProgram;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float N1 = ler.nextFloat();
		float N2 = ler.nextFloat();
		float N3 = ler.nextFloat();
		float N4 = ler.nextFloat();
		float mediafinal;
		float media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;

		if (media >= 7) {
			System.out.printf("Media: %.1f\nAluno aprovado.\n", media);
		} else if (media < 5) {
			System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
		} else {
			float  exame = ler.nextFloat();
			mediafinal = (media + exame) / 2;
			System.out.printf("Media: %.1f\nAluno em exame.\nNota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n",
					media, exame, mediafinal);
		}

		ler.close();
	}
}
