
public class TesteReferenciaPolimorfismo {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Funcionario f1 = new Gerente();
		Designer desenhista = new Designer();

		
		g1.setSalario(4000.0);
		f1.setSalario(2000.0);
		desenhista.setSalario(2000.0);
		
		
		ContaBonificacao controle = new ContaBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(desenhista);
		
		System.out.println("O salário do gerente é de R$" + g1.getSalario());
		
		System.out.println(g1.getSalario());
		System.out.println(f1.getSalario());
		System.out.println();
		System.out.println(g1.getBonificacao());
		System.out.println(f1.getBonificacao());
		System.out.println(desenhista.getBonificacao());
		
		System.out.println();
		
		System.out.println(controle.getSoma());
		
		
	}

}
