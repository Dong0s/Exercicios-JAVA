package FirstProgram;
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double a = ler.nextDouble();
	double b = ler.nextDouble();
	double c = ler.nextDouble();
	
	double delta = Math.pow(b, 2) - 4 * a * c;
	double r1 = (-b + Math.sqrt(delta)) / (2.0*a);
	double r2 = (-b - Math.sqrt(delta)) / (2.0*a);
	if(a ==  0 || delta < 0) {
		System.out.println("Impossivel calcular\n");
	}else {
		System.out.printf("R1 = %.5f\nR2 = %.5f\n",r1,r2);
	}
	
	ler.close();
}
}
