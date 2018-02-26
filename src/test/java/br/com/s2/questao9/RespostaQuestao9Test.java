package br.com.s2.questao9;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testes unitários para classe RespostaQuestao9 usando o conceito BDD
 * @author Vitor.Campos
 * @since 26 fev 2018
 */
public class RespostaQuestao9Test {

	private RespostaQuestao9 respostaQuestao9 = new RespostaQuestao9();
	
	
	/**
	 *      raiz(10)
	 *     /       \
	 *  left1(20)  right1(40) 
	 *   /           \
	 * left2(30)    right2(50)
	 * 
	 */
	@Test
	public void dadoEstruturaBinaryTree_quandoInvocaCalcularSomaDosNos_EntaoResultadoEsperado() {
		BinaryTree raiz = new BinaryTree();
		raiz.setValor(10);
		
		BinaryTree left1 = new BinaryTree();
		left1.setValor(20);
		
		BinaryTree left2 = new BinaryTree();
		left2.setValor(30);
		
		BinaryTree right1 = new BinaryTree();
		right1.setValor(40);
		
		BinaryTree right2 = new BinaryTree();
		right2.setValor(50);
		
		raiz.setLeft(left1);
		left1.setLeft(left2);
		
		raiz.setRight(right1);
		right1.setRight(right2);
		
		int soma = respostaQuestao9.somarValoresDosNosSubsequentes(raiz);

		int resultadoEsperado = 140;
		assertTrue( soma == resultadoEsperado );
	}

}
