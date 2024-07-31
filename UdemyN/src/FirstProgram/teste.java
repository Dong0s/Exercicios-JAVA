package FirstProgram;
import java.io.IOException;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) throws IOException {
 Scanner ler = new Scanner(System.in);
int valor = ler.nextInt();
int nt100;
int nt50;
int nt20;
int nt10;
int nt5;
int nt2;
int nt1;

nt100 = valor/100;
nt50 = (valor %100)/50;
nt20 = ((valor %100)%50)/20;
nt10 = (((valor%100)%50)%20)/10;
nt5 = ((((valor%100)%50)%20)%10)/5;
nt2 = (((((valor%100)%50)%20)%10)%5)/2;
nt1 = ((((((valor%100)%50)%20)%10)%5)%2)/1;



System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n"
		+ "%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00",valor,nt100,nt50,nt20,nt10,nt5,nt2,nt1);
   ler.close();
    }
 
}