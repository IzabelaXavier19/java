package repeticoes;

public class exercicio03 {

	public static void main(String[] args) {
		int x= 1;
		int y =1;
		int contPar=0;
		int contImpar=0;
		System.out.print("Pares: "+ "\n");
		while (x <=100) {
			if (x%2 ==0) {
				System.out.print("\n" + x);
				contPar++;
			}else {
				System.out.print("\n" + x);
				contImpar++;
			}
			x++;
		System.out.println("\n"+contPar);
		System.out.println("\n"+contImpar);
			
			/*System.out.print(x%2==0? x : " " +contImpar= contImpar + 1);
				x++;
				
		}
		System.out.print("Impares: "+ " ");
		while (y <= 100) {
			
			System.out.print(y%2==1? y : " " + contPar = contPar +1);
			y++;
			
		
		}
		System.out.println(contPar+"Pares");
		System.out.println(contImpar+ "Impar");*/
		
	}
	}
}
