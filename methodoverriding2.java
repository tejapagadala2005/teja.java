package com;

public class methodoverriding2 extends methodoverriding1 {
	public void whatsappversion() {
		System.out.println("version->single tick+double tick");
	}
	public static void main(String[] args) {
		methodoverriding2 m2=new methodoverriding2();
		m2.whatsappuser();
		m2.whatsappversion();
	}

}
