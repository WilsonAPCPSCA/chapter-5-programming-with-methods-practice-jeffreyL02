package Homework;
import java.util.Scanner;
public class TimeEnglish {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int hours;
		int minutes;
		do{
		System.out.println("Enter the time(choose hours 1-12)");
		hours = in.nextInt();
		}while(hours <= 0 || hours > 12);
		do {
		System.out.println("Enter the minutes(choose minutes 0-60)");
		minutes = in.nextInt();
		}while(minutes < 0 || minutes > 60);
		System.out.println(getTimeName(hours, minutes));
	}
	public static String getTimeName(int hrs, int mins){
		String print;
		if(mins == 0) {
			print = Integer.toString(hrs) + " o' clock";
		}
		else if(mins == 15){
			print = "quarter after " + Integer.toString(hrs);
		}
		else if(mins == 30){
			print = "half past " +  Integer.toString(hrs);
		}
		else if(mins == 45){
			print = "quarter 'til " +  Integer.toString(hrs - 1);
		}
		else{
			print =  Integer.toString(mins) + " minutes past " +  Integer.toString(hrs);
		}
		return print;
	}
}
