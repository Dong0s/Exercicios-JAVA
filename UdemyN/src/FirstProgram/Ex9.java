package FirstProgram;
import java.util.Scanner;
public class Ex9 {
public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	
	int A = ler.nextInt();
	int B = ler.nextInt();
	
	if(B%A == 0 || A%B == 0) {
		System.out.println("Sao Multiplos");
	}else {
		System.out.println("Nao sao Multiplos");
	}
	ler.close();
}
}
