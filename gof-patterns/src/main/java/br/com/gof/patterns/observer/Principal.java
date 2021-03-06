package br.com.gof.patterns.observer;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {

		CotacaoDollarSubject subject = new CotacaoDollarSubject();

		subject.subscribe(new Corretora1Observer());
		subject.subscribe(new Corretora2Observer());

		List<Double> cotacoes = Arrays.asList(5.11, 5.05, 5.09, 5.15, 5.20);
		cotacoes.stream().forEach(c -> {
			subject.setCotacao(c);
		});
		
		subject.subscribe(new Corretora3Observer());
		subject.setCotacao( 5.21 );

	}

}
