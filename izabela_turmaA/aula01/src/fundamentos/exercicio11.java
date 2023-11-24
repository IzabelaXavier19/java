package fundamentos;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// 1 a 7 e corresponda ao dias da semana
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double dia = entrada.nextDouble();

		
			if(dia == 1) {
				System.out.println("Domingo");
			}
			if (dia == 2) {
			System.out.println("Segunda");
			}		
			if (dia == 3) {
				System.out.println("Terca");
			}		
			
			if (dia == 4) {
				System.out.println("Quarta");
			}		
			
			if (dia == 5) {
				System.out.println("Quinta");
			}		
			
			if (dia == 6) {
				System.out.println("Sexta");
			}		
			
			if (dia == 7) {
				System.out.println("Sabado");
				
			
			}else{
				if (dia > 7  || dia < 1) {
					System.out.println("Numero invalido");
				}
}
}
}
