
public class GerenteTeste {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Thiago de Loreto");

		gerente.setSalario(6000);
				
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getNome());
		System.out.println(gerente.autenticaSenha(222));
		System.out.println(gerente.getBonificacao());
	}

}
