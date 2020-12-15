package br.com.gof.patterns.strategy;

public class LogFileStrategy implements Logger {

	@Override
	public void info(String log) {
		System.out.println("File-info: " + log);
	}

	@Override
	public void error(String log) {
		System.out.println("File-error: " + log);
	}

}
