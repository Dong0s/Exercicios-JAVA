package FirstProgram;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int hInicio = ler.nextInt();
		int hFim = ler.nextInt();
		int tempo;

		if (hInicio > hFim) {
			tempo = 24 + hFim - hInicio;
		} else if (hFim > hInicio) {
			tempo = hFim - hInicio;
		} else {
			tempo = 24;
		}
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		ler.close();
	}

}