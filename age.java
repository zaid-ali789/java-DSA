//Age calculator
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Birth year:");
		int birth=scan.nextInt();
		System.out.println("Enter the current year:");
		int curyear=scan.nextInt();
		int age=curyear-birth;
		System.out.println("Your age according to given data is:"+ age);
	}
}
