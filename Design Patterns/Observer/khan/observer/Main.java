package khan.observer;

public class Main {
	public static void main(String args[]) {
		Subject magazine1 = new Subject();
		Customer c1 = new Customer("Aadil");
		Customer c2 = new Customer("Starbucks");
		
		
		magazine1.enroll(c1);
		magazine1.enroll(c2);
		
		magazine1.update();
		
		
		
	}

}
