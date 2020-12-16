package br.com.gof.patterns.adapter;

public class Principal {
	public static void main(String[] args) {
		
		SMS sms = new SMS();
		sms.setDestino("um destino");
		sms.setOrigem("uma origem");
		sms.setTexto("um texto ....");
		
		SMSSender sender = new SMSAdapter(new EnviadorSMSImpl());
		sender.sendSMS(sms);
	}
}
