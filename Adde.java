package Overloading;

import java.util.concurrent.ForkJoinTask;

public class Adde {
		static int add(int a,int b) {
			return (a+b);
		}
		static int add(int a,int b, int c) {
			return (a+b+c);

	//	double intger
	
	//	static int add(int a ,int b) {
	//		return a+b;
		}
		static  double add(double a ,double b,double c) {
			return a+b+c;
		}
		public void  sum(int a ,double b,float f) {
			System.out.println(a+b+f);
		}
		public void sum(int a,long b,double c) {
			System.out.println(a+b+c);
		}

		
		public  void  sum(int a,double b) {
			System.out.println(" int double method ");
		}
		public void sum(double b,int a,float f) {
			System.out.println("double int float method ");

}
}
