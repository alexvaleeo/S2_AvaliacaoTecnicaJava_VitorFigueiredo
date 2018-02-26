package br.com.s2.questao9;

public class RespostaQuestao9 {
	
	/**
	 * Soma os valores dos nós subsequentes do parâmetro 
	 * (excluindo o valor do nós raiz).
	 * Usa invocações recursivas.
	 * @param raiz
	 * @return
	 */
	public int somarValoresDosNosSubsequentes(BinaryTree raiz) {
		//condição de saida
		if (raiz == null) {
			return 0;
		}
		//valor inicial
		int soma = 0;
		
		//Nós da esquerda
		BinaryTree noDaEsquerda = raiz.getLeft();
		if (noDaEsquerda != null) {
			soma += noDaEsquerda.getValor();
			soma += somarValoresDosNosSubsequentes( noDaEsquerda );
		} 
		
		//Nós da direita
		BinaryTree noDaDireita = raiz.getRight();
		if (noDaDireita != null) {
			soma += noDaDireita.getValor();
			soma += somarValoresDosNosSubsequentes( noDaDireita );
		}
		
		return soma;
	}

}
