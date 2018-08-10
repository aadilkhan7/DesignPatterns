package khan.strategy.PondDuck;

import khan.strategy.duck.Duck;
import khan.strategy.flyingBehavior.FlyWithWings;
import khan.strategy.flyingBehavior.FlyingBehavior;
import khan.strategy.flyingBehavior.FlyingWithRocket;
import khan.strategy.quackingBehavior.QuackHello;
import khan.strategy.quackingBehavior.QuackWassup;
import khan.strategy.quackingBehavior.QuackingBehavior;

public class PondDuck extends Duck {
		
		PondDuck(String name, FlyingBehavior fb, QuackingBehavior qb){
			this.name = name;
			this.fb = fb;
			this.qb = qb;
		}
		
		PondDuck(String name){
			this.name = name;
			this.fb = fb;
			this.qb = qb;
		}
		
		void quack() {
			this.qb.quack();
			System.out.print( this.name +", a "+this.getClass().getSimpleName() );
		}
		
		void fly() {
			this.fb.fly();
		}
		
		public static void main(String args[]) {
			func print = () -> System.out.println();
			
			PondDuck pondy = new PondDuck("Pondy", new FlyingWithRocket(), new QuackHello());
			pondy.quack();
			pondy.fly();
			
			print.line();
			
			PondDuck lynda = new PondDuck("Lynda", new FlyWithWings(), new QuackWassup());
			lynda.quack();
			lynda.fly();
			
		}
		
		interface func{
			public void line();
		}
		
}
