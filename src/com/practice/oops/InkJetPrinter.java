package com.practice.oops;

public class InkJetPrinter implements Printer{

	@Override
	public void printDocument(String docName) {
		System.out.println("print by inkjet printer");
	}

}
