package br.com.s2it.questao8;

public class RespostaQuestao8 {
	
	/**
	 * Cria um inteiro C conforme descri��o da Quest�o 8.
	 * Utiliza StringBuilder para otimizar a concaten�ao de strings.
	 * @param inteiroA
	 * @param inteiroB
	 * @return inteiroC
	 */
	public int criarInteiroC(int inteiroA, int inteiroB) {
		// converte inteiro para string para tornar possivel 
		// recuperar algorismo em posi��es espec�ficas
		String stringA = String.valueOf(inteiroA);
		String stringB = String.valueOf(inteiroB);
		
		// concatena alternadamente 
		StringBuilder stringC = new StringBuilder();
		int i = 0;
		while (i < stringA.length() && i < stringB.length()) {
			char charA = stringA.charAt( i );
			stringC.append( charA );
			
			char charB = stringB.charAt( i );
			stringC.append( charB );
			
			i++;
		}
		
		//completa quando tamanhos s�o diferentes
		if (stringA.length() > stringB.length()) {
			stringC.append( stringA.substring(i) );
			
		} else if (stringB.length() > stringA.length()) {
			stringC.append( stringB.substring(i) );
		}
		
		//converte resultado para inteiro
		int inteiroC = Integer.parseInt( stringC.toString() );
		if (inteiroC > 1000000) {
			return -1;
		} else {
			return inteiroC;
		}
	}
	
}
