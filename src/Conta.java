public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Esta conta é o total de " + Conta.total);

		if (agencia <= 0) {
			System.out.println("Número de agência inválido");
			return;
		} else {
			System.out.println("O número da agência é: " + agencia);
			this.agencia = agencia;
		}

		if (numero <= 0) {
			System.out.println("Número de conta inválido");
			return;
		} else {
			System.out.println("O número da conta é: " + numero);
			this.numero = numero;
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
}