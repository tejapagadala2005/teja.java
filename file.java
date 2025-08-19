package com;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
public class file {
	public static void main(String[] args) {
		File F=new File("hii.txt");
		try {
			boolean res=F.createNewFile();
			System.out.println(res);
			System.out.println(F.getAbsolutePath());
			}
		catch(Exception e) {
			System.out.println("it not true");
		}
		try {
			FileWriter Fw=new FileWriter(F);
			Fw.write("teja");
			Fw.flush();
			Fw.close();
			System.out.println("content is share to file");
		}
		catch(Exception e) {
			System.out.println("cannot write");
		}
		try (FileReader fr = new FileReader(F)) {
			for( int i=0;i<=F.length()-1;i++) {
				System.out.println((char)fr.read());
			}
		}
		catch(Exception e) {
			System.out.println("cannot read");
		}
	}

}
