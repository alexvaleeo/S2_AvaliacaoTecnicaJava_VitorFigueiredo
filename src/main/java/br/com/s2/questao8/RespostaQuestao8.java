package br.com.s2.questao8;

public class RespostaQuestao8 {
	
	public int criarInteiroC(int inteiroA, int inteiroB) {
		//converte inteiro para string 
		String stringA = String.valueOf(inteiroA);
		String stringB = String.valueOf(inteiroB);
		
		//concatena alternadamente 
		StringBuilder stringC = new StringBuilder();
		int i = 0;
		while (i < stringA.length() && i < stringB.length()) {
			char charA = stringA.charAt( i );
			stringC.append( charA );
			
			char charB = stringB.charAt( i );
			stringC.append( charB );
			
			i++;
		}
		
		//completa quando tamanhos são diferentes
		if (stringA.length() > stringB.length()) {
			stringC.append( stringA.substring(i) );
			
		} else if (stringB.length() > stringA.length()) {
			stringC.append( stringB.substring(i) );
		}
		
		//converte resultado para inteiro
		int inteiroC = Integer.parseInt( stringC.toString() );
		if ( inteiroC > 1000000) {
			return -1;
		} else {
			return inteiroC;
		}
	}
	
}
