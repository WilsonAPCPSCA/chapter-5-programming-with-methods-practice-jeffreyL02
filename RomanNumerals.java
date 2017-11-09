package work;
import java.util.Scanner;
public class RomanNumerals {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a nunmber to make it a roman numeral");
		int num = in.nextInt();
		String roman = "";
		String romanOne = romanDigit(num % 10, "I", "V", "X");
		roman += romanOne;
		num = num / 10;
		String romanTen = romanDigit(num % 10, "X", "L", "C");
		roman = romanTen + roman;
		num = num/10;
		String romanHun = romanDigit(num % 10, "C", "D", "M");
		roman = romanHun + roman;
		System.out.println(roman);
		}
	public static String romanDigit(int n, String one, String five, String ten){
		String output = "";
		if(n < 4){
			for(int i = 0; i < n; i++){
				output += one;
			}
		}
		if(n == 4){
			output = output + one + five;
		}
		if(n >= 5 && n <= 8){
			output = output + five;
			for(int i = 0; i < (n - 5); i++){
				output += one;
			} 
		}
		if (n == 9){
			output = output + one + ten;
		}
		return output;
	}
}
