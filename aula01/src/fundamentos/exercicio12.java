package fundamentos;
import java.util.Scanner;


public class exercicio12 {

	public static void main(String[] args) {
		// faça um 2 notas de um aluno e calcule a media dele e mostre na tela
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		double soma = nota1 + nota2;
		double media = soma/2;
		System.out.println("Media:" + media);
	}

}
