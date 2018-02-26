# S2_AvaliacaoTecnicaJava_VitorFigueiredo
Respostas de Vitor Figueiredo para Avaliacao Tecnica Java para processo seletivo de Desenvolvedor Java Sr na S2 IT

# Caracter�sticas do projeto:
- Desenvolvido no Eclipse Oxygen.2
- JUnit 4 para testes unit�rios
- GRADLE para ger�ncia de build e depend�ncias


# C�digo com as respostas:
Existem 2 classes e 2 m�todos com as respostas das quest�es 8 e 9, respectivamente (nota: as classes est�o em /src/main/java):
* Classe br.com.s2it.questao8.RespostaQuestao8 - m�todo criarInteiroC
* Classe br.com.s2it.questao9.RespostaQuestao9 - m�todo somarValoresDosNosSubsequentes 


Tamb�m existem 2 classes e 4 met�dos com os testes unit�rios (nota: as classes est�o em /src/test/java):
* Classe br.com.s2it.questao8.RespostaQuestao8Test:
* m�todo: dadoInteirosComMesmoTamanho_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhoDobrado
* m�todo: dadoInteirosComTamanhosDiferentes_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhosSomados
* m�todo: dadoInteirosComTamanhosGrandes_quandoInvocaCriarInteiroC_entaoResultadoSeraMenosUm
	 
* Classe br.com.s2it.questao9.RespostaQuestao9Test:
* m�todo: dadoEstruturaExemploDeBinaryTree_quandoInvocaCalcularSomaDosNos_EntaoResultadoEsperado



# Como executar os testes unit�rios:
* 1) Por linha de comando, a partir da pasta onde foi feito do git clone, v� para a sub-pasta [GIT__CLONE]/S2_AvaliacaoTecnicaJava_VitorFigueiredo
* 2) Executar 'gradlew build' (sem aspas)
* 3) Resultado dos testes s�o gerados em HTML e podem ser vistos em [GIT__CLONE]/S2_AvaliacaoTecnicaJava_VitorFigueiredo/build/reports/tests/test/index.html
