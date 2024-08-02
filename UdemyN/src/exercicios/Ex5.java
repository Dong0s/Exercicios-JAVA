package exercicios;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senha = ler.nextInt();
		int x = 1;
		while(x>0) {
		if (senha == 2002) {
			System.out.println("Acesso Permitido");
			break;	
		}else {
			System.out.println("Senha Invalida");
			senha = ler.nextInt();
		}
		}
		ler.close();
	}
}
