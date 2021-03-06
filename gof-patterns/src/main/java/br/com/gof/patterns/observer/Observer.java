package br.com.gof.patterns.observer;


/**
 * O observer é uma interface que aqueles que desejarem receber a notificação
 * do dado quando alterado devem implementar.
 * 
 */
public interface Observer {

	public void next(Object data);

}
