package FirstProgram;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
System.out.println("Dia da semana: " + dia);
		ler.close();
	}
}
