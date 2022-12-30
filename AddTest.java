package Overloading;

public class AddTest {

	public static void main(String[] args) {
		System.out.println(Adde.add(11,11));
		System.out.println(Adde.add(11, 22,33));
		System.out.println(Adde.add(22, 33));
		System.out.println(Adde.add(11.5, 22.5, 33.5));
		
		
		Adde a =new Adde();
		a.sum(12, 12.5, 20f);
		a.sum(25, 123.4, 12);
		
		
		a.sum(11, 12.50);
//		a.sum(12, 15, 12f);

	}

}
