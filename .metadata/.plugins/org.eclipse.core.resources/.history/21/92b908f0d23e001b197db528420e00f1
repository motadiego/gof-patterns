package br.com.gof.patterns.observer2;

public class AcoesLogger implements Observador {
	public void mudancaQuantidade(String acao, Integer qtd) {
		System.out.println("Alterada a quantidade da a��o " + acao + " para " + qtd);
	}

	@Override
	public void acaoRemovida(String acao) {
		System.out.println("A a��o " + acao + " foi removida da carteira");
	}
}