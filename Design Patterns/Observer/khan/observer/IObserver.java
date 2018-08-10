package khan.observer;

public interface IObserver {
	void subscribe(IObservable subject);
	void update(int observingValue);
}
