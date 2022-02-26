//Utilizando interfaces, você cria um contrato, que pode ser assinado por qualquer classe.
//Os métodos de uma interface são todos abstratos.
//Neste caso, por exemplo, as classes que assinam o contrato com Autenticável precisam utilizar esses métodos.


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autenticaSenha(int senha);
	
	
}
