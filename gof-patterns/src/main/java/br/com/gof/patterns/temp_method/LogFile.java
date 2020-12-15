package br.com.gof.patterns.temp_method;

public class LogFile extends LogConsumer {

	@Override
	void doInfo(String log) {
		System.out.println("File-info: " + log);
	}

	@Override
	void doError(String log) {
		System.out.println("File-error: " + log);
	}

}
