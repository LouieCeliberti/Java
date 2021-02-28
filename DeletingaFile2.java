package Basic;

import java.io.File;

public class DeletingaFile2 {
	public static void main(String[] args) {
		try{
			File d = new File("GoodBye.pdf");
			if(d.delete()){
				System.out.println(d.getName() + " File has successfully Deleted");
					}
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
