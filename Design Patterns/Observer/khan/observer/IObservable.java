package khan.observer;

public interface IObservable {
	
	void enroll(IObserver subscriber);
	
	void Notify();

}
