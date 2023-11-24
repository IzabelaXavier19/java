package fundamentos;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		System.out.println(numero % 2 == 0 ? "Numero par" : "Numero impar");
		
		
	}

}
