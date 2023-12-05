package fundamentos;
import java.util.StringTokenizer;
import java.util.Scanner;

public class exercicion4 {

	public static void main(String[] args) {
		Scanner index = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		 String texto = index.nextLine();
		 
		// String c = texto.trim();
		 StringTokenizer exemplo = new StringTokenizer(texto);
		 System.out.println(exemplo.countTokens());

		/* System.out.println(c);
		 
		 StringTokenizer exemplo = new StringTokenizer(" texto para retirar espaços no início e fim ");*/
}

}
