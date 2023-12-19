package encapsulamento;

public class Rh {
	public static void main(String[] args) {
		Funcionarios f1 = new Funcionarios();
		f1.nome="Carlos";
		f1.endereco="rua da hora";
		
		
		f1.setSalario(5000.00);
		double salario = f1.getSalario();
		System.out.println(salario);
		
		
		
		
		
		
		
	}
	
	
	

}
