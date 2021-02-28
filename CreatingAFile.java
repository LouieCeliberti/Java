package Basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingAFile {
public static void main(String[] args)throws IOException {
	File f = new File("Test.txt");
	FileWriter writer = new FileWriter(f, true);
	BufferedWriter buf = new BufferedWriter(writer);
	PrintWriter print = new PrintWriter(buf);
	if(f.exists()==true){
		f.createNewFile();
		System.out.println("File has been created");
	}else{
			System.out.println("There was a problem creating a file");
		}
	print.println("Hello, Welcome");
	print.close();
}
}
