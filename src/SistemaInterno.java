
public class SistemaInterno {
	
	private int senha = 1234;
	
	public void autenticaSenha(Autenticavel f) {
		boolean autenticou = f.autenticaSenha(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar!");
		}else {
			System.out.println("Não pode entrar!");
		}
	}
	
}
