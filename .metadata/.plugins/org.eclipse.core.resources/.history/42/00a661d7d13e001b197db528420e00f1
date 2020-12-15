package br.com.gof.patterns.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Um subject é o emissor das mudanças. Ele contém a lista de observers  
 * 
 *
 */
public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();

	public void subscribe(Observer o) {
		observers.add(o);
	}

	public void unsubscribe(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {

		for (Observer o : observers) {
			o.next(getData());
		}
	}

	public abstract Object getData();

}
