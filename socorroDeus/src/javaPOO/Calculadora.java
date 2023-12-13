package javaPOO;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int x ;

		SomarMetodos num = new SomarMetodos();
		x = num.somar(a,b);
		System.out.printf("A soma: %d",x);
		System.out.println();
		
		MultiplicarMetodos y = new MultiplicarMetodos();
		x = y.multiplicar(a, b);
		System.out.printf("A multiplicacao: %d",x);
	}
	
	

}
