package fundamentos;
import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double dia = entrada.nextDouble();
		System.out.println();
		//System.out.println( > 7 || dia < 1 ? "Numero invalido": dia == 1 ? "Domingo" : dia == 2? "Segunda" : dia == 3 ? "Terca": dia == 4? "Quarta" : dia == 5? "Quinta": dia == 6? "Sexta" : dia == 7? "Sabado");
		
		
	}

}

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
