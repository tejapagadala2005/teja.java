package com;

public class laptop {
	private String laptop_name;
	private String laptop_model;
	private int laptop_memory;
	private int laptop_ram;
	private int laptop_cost;
    public laptop() {
    }
    public laptop(String laptop_name,String laptop_model,int laptop_memory,int laptop_ram,int laptop_cost) {
    	laptop_name=this.laptop_name;
    	laptop_model=this.laptop_model;
    	laptop_memory=this.laptop_memory;
    	laptop_ram=this.laptop_ram;
    	laptop_cost=this.laptop_cost;
    }
    public void setlaptop_name(String laptop_name) {
    	this.laptop_name=laptop_name;
    }
    public String getlaptop_name() {
    	return laptop_name;
    }
    public void setlaptop_model(String laptop_model) {
    	this.laptop_model=laptop_model;
    }
    public String getlaptop_model() {
    	return laptop_model;
    }
    public void setlaptop_memory(int laptop_memory) {
    	this.laptop_memory=laptop_memory;
    }
    public int getlaptop_memory() {
    	return laptop_memory;
    }
    public void setlaptop_ram(int laptop_ram) {
    	this.laptop_ram=laptop_ram;
    }
    public int getlaptop_ram() {
    	return laptop_ram;
    }
    public void setlaptop_cost(int laptop_cost) {
    	this.laptop_cost=laptop_cost;
    }
    public int getlaptop_cost() {
    	return laptop_cost;
    }
    public void display() {
		System.out.println("name of laptop="+getlaptop_name());
		System.out.println("model of laptop="+getlaptop_model());
		System.out.println("memory of laptop="+getlaptop_memory());
		System.out.println("ram of laptop="+getlaptop_ram());
		System.out.println("cost of laptop="+getlaptop_cost());
		}
    public static void main(String[] args) {
    System.out.println("comparision of laptops:");
	System.out.println("-----------------------");
	laptop l=new laptop();
	l.setlaptop_name(" HP laptop");
	l.setlaptop_model(" HPI9");
	l.setlaptop_memory( 512);
	l.setlaptop_ram( 32);
	l.setlaptop_cost( 65000);
	l.display();
	System.out.println("----------------");
	laptop l1=new laptop();
	l1.setlaptop_name(" DELL laptop");
	l1.setlaptop_model(" DELLI9");
	l1.setlaptop_memory( 512);
	l1.setlaptop_ram( 32);
	l1.setlaptop_cost( 70000);
	l1.display();
	System.out.println("----------------");
	laptop l2=new laptop();
	l2.setlaptop_name(" LENOVO laptop");
	l2.setlaptop_model(" LENOVOI9");
	l2.setlaptop_memory( 512);
	l2.setlaptop_ram( 32);
	l2.setlaptop_cost( 60000);
	l2.display();
	System.out.println("----------------");
	laptop l3=new laptop();
	l3.setlaptop_name(" APPLLE MACBOOK laptop");
	l3.setlaptop_model(" MACPROI9");
	l3.setlaptop_memory( 512);
	l3.setlaptop_ram( 32);
	l3.setlaptop_cost( 95000);
	l3.display();
	System.out.println("----------------");
	}
   
	}


