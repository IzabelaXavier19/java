package fundamentos;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		double numero3 = entrada.nextDouble();
		
		// leia 3 numeros usando if e else  e mostre o maior e o menor deles;
		if (numero1 > numero2)
			System.out.println(numero1 > numero3 ? "O maior e:" + numero1 + "O menor e:" + numero2: "O maior e:" + numero3 + "O menor:" + numero2);
			
		else 
			System.out.println(numero2 > numero3 ? "O maior e:" + numero2 + "O menor e:" + numero3: "O maior e:"+ numero3 + "O menor e:" + numero1);
		
				
		

	}

}
