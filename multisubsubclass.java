package com;

public class multisubsubclass extends multisubclass {
	public void car3() {
		System.out.println("BMW M5");
	}
	public static void main(String[] args) {
		multisubsubclass mss=new multisubsubclass();
		mss.car3();
		mss.car2();
		mss.car1();
	}

}
