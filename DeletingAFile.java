package Basic;

import java.io.File;
import java.io.IOException;

public class DeletingAFile {
	 public static void main(String[] args)throws IOException {
		File t = new File("Test.txt");
		if(t.delete()){
			System.out.println(t.getName() +"The file has been deleted");
		}else{
			System.out.println("Your file still exist");
		}
	}
}
