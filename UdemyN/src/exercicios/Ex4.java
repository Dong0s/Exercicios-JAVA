package exercicios;
import java.util.Scanner;
public class Ex4 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade = ler.nextInt();
	int soma = 0;
	int cont = 0;
	
	while(idade >= 0) {
	soma += idade;	
	cont += 1;
		
	idade = ler.nextInt();
	}
	if (cont > 0) {
		double media = (double) soma / cont;
		System.out.printf("%.2f%n",media);
	}else {
		System.out.println("Impossivel calcular");
	}
	
	
	
	ler.close();
}
}
