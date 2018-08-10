package khan.strategy.quackingBehavior;

import khan.strategy.duck.Duck;

public class QuackHello implements QuackingBehavior{

	@Override
	public void quack() {
		System.out.print("Hello, I'm ");		
	}	

}
