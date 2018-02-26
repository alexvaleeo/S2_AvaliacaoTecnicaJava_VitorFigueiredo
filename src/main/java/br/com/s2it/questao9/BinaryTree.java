package br.com.s2it.questao9;

/**
 * JavaBean que representa um nó da árvore binária 
 * @author Vitor
 * @since 26 fev 2018
 */
public class BinaryTree {
	
	private int valor;
	
	private BinaryTree left;
	
	private BinaryTree right;


	//acessores...
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
