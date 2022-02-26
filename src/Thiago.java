
public class Thiago {
	
	public static void main(String[] args) {
		
		Funcionario thiago = new Gerente();
		thiago.setNome("Thiago de Loreto");
		thiago.setCpf("031.241.400-52");
		thiago.setSalario(1000);
		
		
		
		System.out.println(thiago.getNome());
		System.out.println(thiago.getCpf());
		System.out.println(thiago.getBonificacao());
	}
}
