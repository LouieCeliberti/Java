package Basic;

public class Finalgrades {

	public static void main(String[] args) {
		
	String[] students =  new String[] {"Jim","Bill","Bob","Fred"};
	
	int[] grades = new int[4];
			grades[0] = 85;
			grades[1] = 78;
			grades[2] = 83;
			grades[3] = 98;
	
	System.out.println("#\tName\tGrades");
	System.out.println("---\t-----\t------");
	
	for(int i = 0; i < grades.length;i++){
		System.out.printf("%d\t%s\t%d\n", i, students[i],grades[i]);
	}
	}
}
