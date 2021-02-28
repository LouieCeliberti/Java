package Basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CreatingaFile2 {
	 public static void main(String[] args) {
		 try{
		File bye = new File("GoodBye.txt");
		FileWriter write = new FileWriter(bye, true);
		BufferedWriter buf = new BufferedWriter(write);
		PrintWriter print = new PrintWriter(buf);
		if(bye.exists() == true){
			bye.createNewFile();
			System.out.println("File has been created");
				}
		print.println("bye");
		print.close();
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
	}
}
