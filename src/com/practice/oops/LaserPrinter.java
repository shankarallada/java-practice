package com.practice.oops;

public class LaserPrinter implements Printer,PenDrive{

	@Override
	public void printDocument(String docName) {//implementation
		System.out.println("print by laser printer");
	}

	@Override
	public void printPenDriveDocuments() {
		System.out.println("print from pendrive");
	}
	

}
