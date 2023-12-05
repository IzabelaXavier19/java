package fundamentos;

public class exercicio01 {

	public static void main(String[] args) {

		int [] intArray = {2,5,46,12,34};
		int b [] = new int[5];
		for (int i =0; i< intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for (int y =4; y>=0; y-- ) {
			//System.out.print(intArray[y]+ " ");
			b[y] = intArray[y];
			System.out.print(b[y]+" ");
			

		}
		//Resultado: 25461234
	}

}
