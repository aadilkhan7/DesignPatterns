package khan.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject implements IObservable{
	
	List<IObserver> subscribers = new ArrayList();
	
	private int stockPrice = 100;

	@Override
	public void enroll(IObserver subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void Notify() {
		for (IObserver subs : subscribers) {
			subs.update(this.stockPrice);
		}		
	}
	
	public void update() {
		Random r = new Random();
		this.stockPrice = r.nextInt();
		this.Notify();
	}
	

	
}
