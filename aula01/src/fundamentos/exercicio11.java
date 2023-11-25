package fundamentos;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// 1 a 7 e corresponda ao dias da semana
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double dia = entrada.nextDouble();

		
		
		System.out.println(dia > 7 || dia < 1 ? "Numero invalido": dia == 1 ? "Domingo" : dia == 2? "Segunda" : dia == 3 ? "Terca": dia == 4? "Quarta" : dia == 5? "Quinta": dia == 6? "Sexta" : dia == 7? "Sabado": "invalido");
		

}
}

