
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public double getBonificacao() {
		return super.getSalario() * 0.5;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticaSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
