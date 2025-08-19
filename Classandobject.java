package com;

public class Classandobject {
	static String company_name="tcs";
	static String company_location="hyd";
	String emp_name;
	int emp_id;
	int emp_salary;
	public static void developer() {
		System.out.println("designation is developer");
		}
	public static void tester() {
		System.out.println("designation is tester");
		}
	public static void main(String[] args) {
		System.out.println(company_name);
		System.out.println(company_location);
		Classandobject Co=new Classandobject();
		Co.emp_name="teja";
		System.out.println(Co.emp_name);
		Co.emp_id=403;
		System.out.println(Co.emp_id);
		Co.emp_salary=50000;
		System.out.println(Co.emp_salary);
		developer();
		System.out.println("_________________");
		System.out.println(company_name);
		System.out.println(company_location);
		Classandobject Co1=new Classandobject();
		Co1.emp_name="sai";
		System.out.println(Co1.emp_name);
		Co1.emp_id=401;
		System.out.println(Co1.emp_id);
		Co1.emp_salary=35000;
		System.out.println(Co1.emp_salary);
		tester();
		System.out.println("_________________");
		}
	}
