package oop.asg11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestAccount {
	
	public void makeDir(String path) {
		File file = new File(path);
		if(!file.exists()) {
			file.mkdir();
		}
	}
	
	public void createFile(String path) {
		File file = new File(path);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void writeLines(String fname, String value) {
		try {
			// Build a writer on the fname (also works on File objects)
			PrintWriter out = new PrintWriter(new FileWriter(fname));
			// Send out.print(), out.println() to write chars
			out.println(value);
			out.close(); // polite
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args)  {
		
		File file = new File("");;
		TestAccount test = new TestAccount();
		test.makeDir(file.getAbsoluteFile()+"\\resource");
		test.makeDir(file.getAbsoluteFile()+"\\resource\\files");
		test.createFile(file.getAbsolutePath()+"\\resource\\files\\master.txt");
		test.createFile(file.getAbsolutePath()+"\\resource\\files\\tran.txt");
		test.createFile(file.getAbsolutePath()+"\\resource\\files\\oldmast.txt");
		
		AccountRecord data = new AccountRecord(100, "Alan", "Jones", 348.17);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\master.txt", data.toString());
		
		data = new AccountRecord(300, "Mary", "Smith", 27.19);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\master.txt", data.toString());
		
		data = new AccountRecord(500, "Sam", "Sharp", 0.00);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\master.txt", data.toString());
		
		data = new AccountRecord(700, "Suzy", "Green", 14.22);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\master.txt", data.toString());
		
		TransactionRecord tran = new TransactionRecord(100,27.14);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\tran.txt", data.toString());
		
		tran = new TransactionRecord(300, 62.11);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\tran.txt", data.toString());
		
		tran = new TransactionRecord(400, 100.56);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\tran.txt", data.toString());
		
		tran = new TransactionRecord(900, 82.17);
		test.writeLines(file.getAbsolutePath()+"\\resource\\files\\tran.txt", data.toString());
		
		
	}
}
