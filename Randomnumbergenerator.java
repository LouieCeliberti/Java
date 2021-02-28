package Basic;

import java.util.Random;

public class Randomnumbergenerator {
	public static void main(String[] args) {
		 Random gen = new Random(1);
		 
		 for(int i = 0; i < 10; i++){
			 System.out.println(gen.nextInt(100)+1);
		 }
	}
}
