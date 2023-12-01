package fundamentos;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int c [] = new int [10];
		int d [] = new int [10];
			
		for (int x=0; x< a.length; x++) {
			System.out.println("Digite um numero: ");
			a[x] = entrada.nextInt();
		
		}
		for (int i=0; i< a.length; i++) {
			System.out.println("Digite um numero: ");
			b[i] = entrada.nextInt();
		
		}
		for (int o=0; o< a.length; o++) {
			System.out.println("Digite um numero: ");
			c[o] = entrada.nextInt();
		
		}
		for (int t=0; t< a.length; t++) {
			System.out.println("Digite um numero: ");
			d[t] = entrada.nextInt();
		
		}
		for (int k:a ) {
			System.out.print(k+" ");
		}
		for (int w:b) {
			System.out.print(w+" ");
		}
		for (int q:c) {
			System.out.print(q+" ");

		}
		for (int p:d) {
			System.out.print(p+" ");

		}
	
}

}


