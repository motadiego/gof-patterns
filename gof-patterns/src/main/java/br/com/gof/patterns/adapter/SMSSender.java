package br.com.gof.patterns.adapter;

public interface SMSSender {
	public boolean sendSMS(SMS sms);
}