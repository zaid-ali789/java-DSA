//area and circumfernece
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double rad=scanner.nextDouble();
		double circum=2*3.147*rad;
		double area=3.147*rad*rad;
		System.out.println("The circumference of the circle is:"+ circum);
		System.out.println("The area of the circle:"+ area);
	}
}
