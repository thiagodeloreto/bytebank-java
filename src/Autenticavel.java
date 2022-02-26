//Utilizando interfaces, voc� cria um contrato, que pode ser assinado por qualquer classe.
//Os m�todos de uma interface s�o todos abstratos.
//Neste caso, por exemplo, as classes que assinam o contrato com Autentic�vel precisam utilizar esses m�todos.


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autenticaSenha(int senha);
	
	
}
