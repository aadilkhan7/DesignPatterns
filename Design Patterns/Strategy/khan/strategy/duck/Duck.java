package khan.strategy.duck;

import khan.strategy.flyingBehavior.FlyWithWings;
import khan.strategy.flyingBehavior.FlyingBehavior;
import khan.strategy.flyingBehavior.FlyingWithRocket;
import khan.strategy.quackingBehavior.QuackingBehavior;

public abstract class Duck {
	public String name;	
	public FlyingBehavior fb;
	public QuackingBehavior qb;
	
}
