package loops;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y =0;
		int x =0;
		for (int i=1;i<=50;i++) {
			if (i%2 == 0) {
				y= i/2;
				System.out.println(i+ " "+y);
			}else {
				x= 3* i +1;
				System.out.println(i+" "+x);
			}
			
	
		}
	}

}
