package br.com.gof.patterns.temp_method;

/**
 * Neste exemplo usamos o Strategy e o Template Method.
 * 
 * Observe que o método de info e error possuem implementações
 * 
 */
public abstract class LogConsumer {

	public void info(String log) {
		System.out.println("I have a flow control of info");
		doInfo(log);
	}

	public void error(String log) {
		// posso adicionar código aqui sob controle da implementação filha.
		System.out.println("I have a flow control of erro");
		doError(log);
	}

	abstract void doInfo(String log);

	abstract void doError(String log);

}
