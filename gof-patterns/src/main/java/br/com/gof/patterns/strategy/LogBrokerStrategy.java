package br.com.gof.patterns.strategy;

public class LogBrokerStrategy implements Logger {

	@Override
	public void info(String log) {
		System.out.println("Broker-send-info: " + log);
	}

	@Override
	public void error(String log) {
		System.out.println("Broker-send-error: " + log);
	}

}
