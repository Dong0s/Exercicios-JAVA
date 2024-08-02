package exercicios;

import java.util.Scanner;

public class Ex6 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int x = ler.nextInt();
	int y = ler.nextInt();
	int pos = 1;
	
	while(pos > 0) {
		if(x > 0 && y > 0) {
			System.out.println("primeiro");
			x = ler.nextInt();
			y = ler.nextInt();
		}else if(x > 0 && y < 0) {
			System.out.println("quarto");
			x = ler.nextInt();
			y = ler.nextInt();
		}else if(x < 0 && y < 0) {
			System.out.println("terceiro");
			x = ler.nextInt();
			y = ler.nextInt();
		}else if(x < 0 && y > 0) {
			System.out.println("segundo");
			x = ler.nextInt();
			y = ler.nextInt();
			
		}else if(x == 0 || y == 0) {
			break;
		}
	}
	
	
	ler.close();
}
}
