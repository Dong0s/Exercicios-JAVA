package FirstProgram;
import java.util.Scanner;
public class Ex2 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double nota1 = ler.nextDouble();
	double nota2 = ler.nextDouble();
	
	double notafinal = nota1 + nota2;
	
	if(notafinal >  60) {
		System.out.println("Auluno Aprovado Nota: "+ notafinal);
	}else {
		System.out.println("Aluno Reprovado Nota: "+ notafinal+ " Nota minima 60.0");
	}
	ler.close();
}
}
