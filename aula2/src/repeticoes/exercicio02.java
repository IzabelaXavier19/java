package repeticoes;
import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int qtd = entrada.nextInt();
		int aluno = 0;
		double soma =0;
		double media = 0;
		
		while (aluno < qtd) {
			System.out.println("Digite a nota dos alunos: ");
			double nota = entrada.nextDouble();
			soma += nota;
			aluno++;
		
	}
	media = soma/qtd;
	System.out.println("A media da sala e: " + media);

}
}
