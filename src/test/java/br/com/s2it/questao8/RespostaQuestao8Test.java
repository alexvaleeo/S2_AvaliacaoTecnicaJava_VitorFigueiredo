package br.com.s2it.questao8;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.s2it.questao8.RespostaQuestao8;

/**
 * Testes unitário da classe RespostaQuestao8 usando BDD (dado, quando, entao)
 * @author Vitor Figueiredo
 * @since 26 fev 2018
 */
public class RespostaQuestao8Test {

	private RespostaQuestao8 respostaQuestao8 = new RespostaQuestao8();

	@Test
	public void dadoInteirosComMesmoTamanho_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhoDobrado() {
		int inteiroA = 135;
		int inteiroB = 246;
		int resultadoEsperado = 123456;
		
		int inteiroC = respostaQuestao8.criarInteiroC(inteiroA, inteiroB);
		
		assertTrue( inteiroC == resultadoEsperado );
	}


	@Test
	public void dadoInteirosComTamanhosDiferentes_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhosSomados() {
		int inteiroA = 13;
		int inteiroB = 246;
		int resultadoEsperado = 12346;
		
		int inteiroC = respostaQuestao8.criarInteiroC(inteiroA, inteiroB);
		
		assertTrue( inteiroC == resultadoEsperado );
	}

	
	@Test
	public void dadoInteirosComTamanhosGrandes_quandoInvocaCriarInteiroC_entaoResultadoSeraMenosUm() {
		int inteiroA = 1357;
		int inteiroB = 24680;
		int resultadoEsperado = -1;
		
		int inteiroC = respostaQuestao8.criarInteiroC(inteiroA, inteiroB);
		
		assertTrue( inteiroC == resultadoEsperado );
	}

}
