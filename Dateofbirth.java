package Basic;

import java.util.Scanner;

public class Dateofbirth {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Month : ");
		int day = input.nextInt();
		System.out.println("Please enter the Day : ");
		int month = input.nextInt();
		System.out.println("Please enter the year : ");
		int year = input.nextInt();
		System.out.printf("You were born on %s %s, %d",GetMonth(month),GetDay(day), GetYear(year));
	}
	public static String GetMonth(int month){
		
	String r = "Not known";
	switch (month){
	case 0 : 
		r = "January";
		break;
	case 1 : 
		r = "February";
		break;
	case 2 : 
		r = "March";
		break;
	case 3 : 
		r = "April";
		break;
	case 4 : 
		r = "May";
		break;
	case 5 : 
		r = "June";
		break;
	case 6 : 
		r = "July";
		break;
	case 7 : 
		r = "August";
		break;
	case 8 : 
		r = "September";
		break;
	case 9 : 
		r = "October";
		break;
	case 10 : 
		r = "November";
		break;
	case 11 : 
		r = "December";		
		break;
	}
	return r;
}
public static String GetDay(int day){
	String r ;
		if(day != 11 && day % 10 == 1){
			r = day + "st";
		}else if(day != 12 && day % 10 == 2){
			r = day + "nd";
		} else if(day != 13 && day % 10 == 3){
			r = day + "rd";
		}else {
			r = day + "th";
		}
return r;
}
public static int GetYear(int year){
	
	int r = 1;
	switch (year){
	case 0 :
		r = 1992;
		break;
	case 1 :
		r = 1993;
		break;
	case 2 :
		r = 1994;
		break;
	case 3 :
		r = 1995;
		break;
	case 4 :
		r = 1996;
		break;
	case 5 :
		r = 1997;
		break;
	case 6 :
		r = 1998;
		break;
	case 7 :
		r = 1999;
		break;
	case 8 :
		r = 2000;
		break;
	case 9 :
		r = 2001;
		break;
	case 10 :
		r = 2002;
		break;
	}

	return r;
}
}
