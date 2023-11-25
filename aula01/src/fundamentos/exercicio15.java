package fundamentos;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2)/2;
		//System.out.println(media);
		System.out.println(media >= 7? "a media e: "+media +" Aprovado" :media >=4? media + " Recuperacao": media + " Reprovado");
	}

}
