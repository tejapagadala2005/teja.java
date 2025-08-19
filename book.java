package com;

public class book {
	private String title;
	private String author;
	private String noofpages;
	private int cost;
	public book() {
	}
	public  book(String title,String author,String noofpages,int cost) {
		this.title=title;
		this.author=author;
		this.noofpages=noofpages;
		this.cost=cost;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String gettitle() {
		return title;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public String getauthor() {
		return author;
	}
	public void setnoofpages(String noofpages) {
		this.noofpages=noofpages;
	}
	public String getnoofpages() {
		return noofpages;
	}
	public void setcost(int cost) {
		this.cost=cost;
	}
	public int getcost() {
		return cost;
	}
	public void display() {
		System.out.println("name of book="+gettitle());
		System.out.println("author of book="+getauthor());
		System.out.println("no.of pages of book="+getnoofpages());
		System.out.println("cost of book="+getcost());
		}
	public static void main(String[] args) {
		System.out.println("book density");
		book m=new book();
		m.settitle("avengers");
		m.setauthor("likith");
		m.setnoofpages("100");
		m.setcost(59);
		m.display();
		System.out.println("------------------");
	}
	}

	


