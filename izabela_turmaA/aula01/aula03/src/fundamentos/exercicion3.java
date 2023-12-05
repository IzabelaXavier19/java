package fundamentos;
import java.util.StringTokenizer;

public class exercicion3 {
public static void main(String[] args) {
	/*String valor = "CDD4.0 - Java";
	 System.out.println(valor.compareTo("CDD4.0 - Java\") == 0 ? true : false);
	 		
	 System.out.println(valor.compareTo("CDD4.0 -	JAVA\") == 0 ? true : false);
	 		
	 System.out.println(valor.compareToIgnoreCase
	 ("CDD4.0 - JAVA") == 0 ? true : false);*/
	StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
	System.out.println(exemplo.countTokens());
}
}
