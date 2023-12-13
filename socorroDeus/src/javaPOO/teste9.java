package javaPOO;

public class teste9 {

	public static void main(String[] args) {
		int idade;
		double valor;
		String nome;
		boolean estado;
		JavaMetodos t = new JavaMetodos();
		idade = t.idade();
		valor = t.valor();
		nome =t.nome();
		estado = t.estado();
		System.out.printf("A idade %d de %s" , idade, nome);
	
		
	}

}
