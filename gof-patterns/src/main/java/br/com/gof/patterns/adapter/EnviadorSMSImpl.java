package br.com.gof.patterns.adapter;

public class EnviadorSMSImpl implements EnviadorSMS {

	@Override
	public void enviarSMS(String destino, String origem, String[] msgs) throws SMSException {
		System.out.println("Enviando a mensagem via EnviadorSMS");
		System.out.println("Origem : " + origem);
		System.out.println("Destino:" + destino);
		System.out.println("Texto:");
		for (int i = 0; i < msgs.length; i++) {
			System.out.println(msgs[i]);
		}
	}
	
}
