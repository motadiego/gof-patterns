package br.com.gof.patterns.factory;

import java.util.HashMap;

import br.com.gof.patterns.strategy.Logger;

public class LogFactoryStrategy {

	private HashMap<LogTypes, String> instances = new HashMap<LogTypes, String>();

	public LogFactoryStrategy() {
		instances.put(LogTypes.FILE_STRATEGY, "br.com.gof.patterns.strategy.LogFileStrategy");
		instances.put(LogTypes.BROKER_STRATEGY, "br.com.gof.patterns.strategy.LogBrokerStrategy");
	}

	public Logger getLogger(LogTypes type) {

		String classType = instances.get(type);
		if (classType == null)
			throw new IllegalArgumentException("Invalid type: " + type);

		try {
			return (Logger) Class.forName(classType).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Falha ao instanciar " + classType + " " + e.getMessage());
		}

	}

}
