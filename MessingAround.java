package Basic;

public class MessingAround {
	public static void main(String[] args) {
		
		int x = 30;
		int y = 0;
		
		try{
			int result = x/y;
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
