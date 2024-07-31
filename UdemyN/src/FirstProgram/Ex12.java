package FirstProgram;
import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {
	Scanner ler =  new Scanner(System.in);
	double intervalo = ler.nextDouble();
	
	if(intervalo < 0 || intervalo > 100) {
		System.out.println("Fora de intervalo");
	}
	else if(intervalo <= 25) {
		System.out.printf("Intervalo [0,25]\n");
	}else if(intervalo <= 50){
		System.out.printf("Intervalo (25,50]\n");
	}else if(intervalo <= 75) {
		System.out.printf("Intervalo (50,75]\n");
	}else if(intervalo <= 100) {
		System.out.printf("Intervalo (75,100]\n");
	}
	
	ler.close();
}
}
