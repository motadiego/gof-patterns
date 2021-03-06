package br.com.gof.patterns.observer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {
	private Map<String, Integer> acoes = new HashMap<>();
	private List<Observador> obs = new ArrayList<>();

	public void adicionaAcoes(String acao, Integer qtd) {
		if (acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		acoes.put(acao, qtd);
		notificar(acao, qtd);
	}
	
	public void removerAcao(String acao) {
		if (acoes.containsKey(acao)) {
			acoes.remove(acao);
		}
		
		notificarRemocao(acao);
	}
	
	
	private void notificar(String acao, Integer qtd) {
		for (Observador o : obs)
			o.mudancaQuantidade(acao, qtd);
	}
	
	
	private void notificarRemocao(String acao) {
		for (Observador o : obs)
			o.acaoRemovida(acao);
	}
	
	public void addObservador(Observador o) {
		obs.add(o);
	}
}