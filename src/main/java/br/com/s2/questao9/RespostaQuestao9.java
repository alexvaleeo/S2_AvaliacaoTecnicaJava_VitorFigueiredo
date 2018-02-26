package br.com.s2.questao9;

public class RespostaQuestao9 {
	
	/**
	 * Soma os valores dos n�s subsequentes do par�metro 
	 * (excluindo o valor do n�s raiz).
	 * Usa invoca��es recursivas.
	 * @param raiz
	 * @return
	 */
	public int somarValoresDosNosSubsequentes(BinaryTree raiz) {
		//condi��o de saida
		if (raiz == null) {
			return 0;
		}
		//valor inicial
		int soma = 0;
		
		//N�s da esquerda
		BinaryTree noDaEsquerda = raiz.getLeft();
		if (noDaEsquerda != null) {
			soma += noDaEsquerda.getValor();
			soma += somarValoresDosNosSubsequentes( noDaEsquerda );
		} 
		
		//N�s da direita
		BinaryTree noDaDireita = raiz.getRight();
		if (noDaDireita != null) {
			soma += noDaDireita.getValor();
			soma += somarValoresDosNosSubsequentes( noDaDireita );
		}
		
		return soma;
	}

}
