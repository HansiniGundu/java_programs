package java_programs;

class Animal{
	void eat() {
		System.out.println("The Animal eats.");
	}
	
	void sound() {
		System.out.println("The Animal makes a sound.");
	}
	
	void walk() {
		System.out.println("The Animal walks");
	}
}

class Lion extends Animal{
	void eat() {
		System.out.println("The Lion Animal eats.");
	}
	
	void sound() {
		System.out.println("The Lion Animal makes a sound.");
	}
	
}

class Tiger extends Animal{
	void eat() {
		System.out.println("The Tiger Animal eats.");
	}
	
	void sound() {
		System.out.println("The Tiger Animal makes a sound.");
	}
	
}

class Panther extends Animal{
	void eat() {
		System.out.println("The Panther Animal eats.");
	}
	
	void sound() {
		System.out.println("The Panther Animal makes a sound.");
	}
	
}
public class Jungle {
	
	public static void main(String args[]) {
		Lion l1 = new Lion();
		Tiger t1 = new Tiger();
		Panther p1 = new Panther();
		
		
		l1.eat();
		l1.sound();
		l1.walk();
		
		t1.eat();
		t1.sound();
		t1.walk();
		
		p1.eat();
		p1.sound();
		p1.walk();
	}
}
