package com.practice.oops;

public class Main {
	
	public static void main(String[] args) {
		Printer printer =App.getPrinter("i");//abstraction
		Printer obj = new InkJetPrinter();
		Object obj2 = new LaserPrinter();
		int a =5;
		String b="text";
		printer.printDocument("marriage photo");
	}
}
