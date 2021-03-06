package br.com.gof.patterns.factory;

import java.util.HashMap;

import br.com.gof.patterns.temp_method.LogConsumer;

public class LogFactoryTemplateMethod {

	private HashMap<LogTypes, String> instances = new HashMap<LogTypes, String>();

	public LogFactoryTemplateMethod() {
		instances.put(LogTypes.FILE_TEMPLATE_METHOD, "br.com.gof.patterns.temp_method.LogFile");
		instances.put(LogTypes.BROKER_TEMPLATE_METHOD, "br.com.gof.patterns.temp_method.LogBroker");
	}

	public LogConsumer getLogger(LogTypes type) {

		String classType = instances.get(type);
		if (classType == null)
			throw new IllegalArgumentException("Invalid type: " + type);

		try {
			return (LogConsumer) Class.forName(classType).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Falha ao instanciar " + classType + " " + e.getMessage());
		}

	}

}
