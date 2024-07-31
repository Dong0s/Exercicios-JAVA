package FirstProgram;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id = ler.nextInt();
		int qnt = ler.nextInt();
		double preco = 0;
		switch (id) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		}
		double precot = qnt * preco;
System.out.printf("Total: R$ %.2f\n",precot);
		ler.close();
	}
}
