package com.practice.oops;

public class App {
	public static Printer getPrinter(String type) {
		if(type.equals("l")) {
			return new LaserPrinter();
		}
		else if(type.equals("i")) {
			return new InkJetPrinter();
		}
		return null;
	}

}
