package FirstProgram;
import  java.util.Scanner;
public class estruturas {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int hora;
	System.out.println("Que Horas São?");
	hora = ler.nextInt();
	
	if(hora < 12) {
		System.out.println("Boa Dia");
	}else if(hora <= 18) {
			System.out.println("Boa Tarde");
	}else {
				System.out.println("Boa Noite");
		}
	
	
	ler.close();
	
	
}
}
