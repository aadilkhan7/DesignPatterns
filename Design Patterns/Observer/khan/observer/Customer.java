package khan.observer;

public class Customer implements IObserver {
	String name;
	
	Customer(String aname){
		this.name = aname;
	}
	
	@Override
	public void subscribe(IObservable subject) {
		subject.enroll(this);
	}

	@Override
	public void update(int updatedPrice) {
		System.out.println("Stock price changed to "+updatedPrice);				
	}

}
