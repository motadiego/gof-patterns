package br.com.gof.patterns.observer;

public class CotacaoDollarSubject extends Subject {

	private Double cotacao;
	
	
	public void setCotacao(Double c) {
		this.cotacao = c;
		notifyObservers();
	}
	
	@Override
	public Object getData() {
		return cotacao;
	}
	
	
}
