package exercicios;
import java.util.Scanner;
public class Ex9 {
public static void main(String[] args) {
	Scanner  ler = new Scanner(System.in);
	int cont = 0;
	int idade;
	int soma = 0;
	int div = 0;
	while(cont == 0) {
		idade = ler.nextInt();
		if(idade >= 0) {
			soma += idade;
			div++;
		}else {
			double res = (double)soma/div;
			System.out.printf("%.2f%n",res);
			break;
		}
		
		
	}
	
	
	
	ler.close();
}
}
