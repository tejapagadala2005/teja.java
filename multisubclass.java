package com;

public class multisubclass extends multisuperclass {
	public void car2() {
		System.out.println("BMW M3");
	}
	public static void main(String[] args) {
		multisubclass ms=new multisubclass();
		ms.car1();
		ms.car2();
	}

}
