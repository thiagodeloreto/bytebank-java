//O Abstract n�o deixa criar um objeto apenas funcion�rio.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
//M�todo abstrato, ou seja, m�todo sem corpo - os filhos implementam esses m�todos, que se tornam obrigat�rios.
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
