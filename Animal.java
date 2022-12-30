package Overloading;

public class Animal {
		
	}

class Monkey extends Animal{
}
class Test7{
	public void m1(Animal a) {
		System.out.println("Animal verson");
	}
			public void m1(Monkey m) {
			System.out.println("monkey versom");
		}
}
