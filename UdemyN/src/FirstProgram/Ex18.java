package FirstProgram;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario  = ler.nextDouble();
		double res;
		double imposto;
		if(salario <= 2000.00) {
			System.out.println("Isento");
		}else if(salario >= 2000 && salario <= 3000) {
			res = salario - 2000;
			imposto = res * 0.08;
			
			System.out.printf("R$ %.2f\n",imposto);
		}else if(salario >= 3000.01 &&  salario <= 4500) {
		
			imposto = 1000 * 0.08;
			res =  salario - 3000;
			imposto += res  *0.18;
			System.out.printf("R$ %.2f\n",imposto);
		}else {
			imposto = 1000 * 0.08 + 1500 * 0.18;
			res = salario - 4500;
			imposto += res *  0.28;
			System.out.printf("R$ %.2f\n",imposto);
		}
		
		
		ler.close();
	}
}
