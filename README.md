# S2_AvaliacaoTecnicaJava_VitorFigueiredo
Respostas de Vitor Figueiredo para Avaliacao Tecnica Java para processo seletivo de Desenvolvedor Java Sr na S2 IT

# Características do projeto:
- Desenvolvido no Eclipse Oxygen.2
- JUnit 4 para testes unitários
- GRADLE para gerência de build e dependências


# Código com as respostas:
Existem 2 classes e 2 métodos com as respostas das questões 8 e 9, respectivamente (nota: as classes estão em /src/main/java):
* Classe br.com.s2it.questao8.RespostaQuestao8 - método criarInteiroC
* Classe br.com.s2it.questao9.RespostaQuestao9 - método somarValoresDosNosSubsequentes 


Também existem 2 classes e 4 metódos com os testes unitários (nota: as classes estão em /src/test/java):
* Classe br.com.s2it.questao8.RespostaQuestao8Test:
* método: dadoInteirosComMesmoTamanho_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhoDobrado
* método: dadoInteirosComTamanhosDiferentes_quandoInvocaCriarInteiroC_entaoResultadoSeraTamanhosSomados
* método: dadoInteirosComTamanhosGrandes_quandoInvocaCriarInteiroC_entaoResultadoSeraMenosUm
	 
* Classe br.com.s2it.questao9.RespostaQuestao9Test:
* método: dadoEstruturaExemploDeBinaryTree_quandoInvocaCalcularSomaDosNos_EntaoResultadoEsperado



# Como executar os testes unitários:
* 1) Por linha de comando, a partir da pasta onde foi feito do git clone, vá para a sub-pasta [GIT__CLONE]/S2_AvaliacaoTecnicaJava_VitorFigueiredo
* 2) Executar 'gradlew build' (sem aspas)
* 3) Resultado dos testes são gerados em HTML e podem ser vistos em [GIT__CLONE]/S2_AvaliacaoTecnicaJava_VitorFigueiredo/build/reports/tests/test/index.html
