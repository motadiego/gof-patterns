package br.com.gof.patterns.factory;

import br.com.gof.patterns.strategy.Logger;
import br.com.gof.patterns.temp_method.LogConsumer;

public class Principal {

	public static void main(String[] args) {

		LogFactoryStrategy factory = new LogFactoryStrategy();

		Logger logger = factory.getLogger(LogTypes.FILE_STRATEGY);
		logger.error("deu um erro");

		logger = factory.getLogger(LogTypes.BROKER_STRATEGY);
		logger.error("deu um erro");

		LogFactoryTemplateMethod factoryTm = new LogFactoryTemplateMethod();

		LogConsumer logConsumer = factoryTm.getLogger(LogTypes.FILE_TEMPLATE_METHOD);
		logConsumer.info("Segue uma info");

		logConsumer = factoryTm.getLogger(LogTypes.BROKER_TEMPLATE_METHOD);
		logConsumer.info("Segue outra info");
		
		logConsumer.error("Segue um  erro");

	}

}
