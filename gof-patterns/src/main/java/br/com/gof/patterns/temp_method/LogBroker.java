package br.com.gof.patterns.temp_method;

public class LogBroker extends LogConsumer {

	@Override
	public void doInfo(String log) {
		System.out.println("Broker-send-info: " + log);
	}

	@Override
	public void doError(String log) {
		System.out.println("Broker-send-error: " + log);
	}

}
