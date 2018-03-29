package com.abinash;

abstract class P{
	abstract public void m1();
	public void m2()
	{
		System.out.println("running m2 in P class");
	}
	static void m3(){
		System.out.println("running m3 in P Class");
	}
}
class Q extends P{
	public void m1(){
		System.out.println("running m1 in Q Class");
	}
}

public class AbsCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("running main");
         Q ref = new Q();
         ref.m1();
         ref.m2(); P.m3();
	}

}
