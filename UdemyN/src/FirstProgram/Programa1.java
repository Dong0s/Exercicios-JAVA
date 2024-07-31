package FirstProgram;
import java.util.Locale;
public class Programa1 {
public  static void main(String[] args) {
	
	double x = 10.35784;
	
	System.out.println(x);
	System.out.printf("%.2f\n", x);
	System.out.printf("%.4f", x);
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f", x);
	System.out.println();
	
	
	//Math.sqrt(variavel) significa a raiz quadrada, Math.pow(variavel1,variavel2), Math.abs(variavel) recebe o valor absoluto
	}
}
