package encapsulamento;

public class Funcionarios {
	String nome;
	String endereco;
private	String cpf;
private	String rg;
private	String email;
private	String telefone;
private	int qtdFilhos;
private	double salario;


public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public int getQtdFilhos() {
	return qtdFilhos;
}
public void setQtdFilhos(int qtdFilhos) {
	this.qtdFilhos = qtdFilhos;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


}

