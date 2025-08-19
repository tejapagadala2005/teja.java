package com;

public class flipkart_methodoverloading {
	public static void payment(int num,int cvv,int bal) {
		System.out.println("pay through debit card");
	}
	public static void payment(int num,int exp) {
		System.out.println("pay through credit card");
		}
	public static void payment(int cash) {
		System.out.println("pay through cash");
		}
	public static void main(String[] args) {
		payment(80,576,85000);
		payment(45,2029);
		payment(250);
	}
}
