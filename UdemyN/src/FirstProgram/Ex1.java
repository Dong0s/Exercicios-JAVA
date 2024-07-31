package FirstProgram;
import java.util.Scanner;
import java.util.Locale;
public class Ex1 {
public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner ler = new Scanner(System.in);
	double comprimento,largura,preçoM;
	
	System.out.println("Qual o comprimento?");
	comprimento = ler.nextDouble();
	ler.nextLine();
	System.out.println("Qual a largura?");
	largura = ler.nextDouble();
	ler.nextLine();
	System.out.println("Qual o preço do metro quadrado?");
	preçoM = ler.nextDouble();
	ler.nextLine();
	double area,precof;
	area = largura * comprimento;
	precof = area * preçoM;
	
	System.out.printf("Tamanho da aréa:%.2f Metros\nPreço do terreno:%.2f R$",area,precof);
	ler.close();
}
}
