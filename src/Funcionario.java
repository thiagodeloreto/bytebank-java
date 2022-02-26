//O Abstract não deixa criar um objeto apenas funcionário.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
//Método abstrato, ou seja, método sem corpo - os filhos implementam esses métodos, que se tornam obrigatórios.
	public abstract double getBonificacao();
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
