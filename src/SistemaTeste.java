
public class SistemaTeste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(1234);
		
		Administrador adm = new Administrador();
		adm.setSenha(1234);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autenticaSenha(gerente);
		sistema.autenticaSenha(adm);
		
		Cliente1 cliente = new Cliente1();
		cliente.setSenha(1234);

		sistema.autenticaSenha(cliente);
		
	}

}
