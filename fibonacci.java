//fibonacci
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the fibonacci series:");
		int n=scan.nextInt();
		int first=0;
		int secondterm=1;
		System.out.println("The fibonacci series of length"+ n +"terms is:");
		System.out.print(first +" "+secondterm);
		for(int i=0;i<n;i++)
		{
		    int next=secondterm+first;
		    System.out.print(" "+ next);
		    first=secondterm;
		    secondterm=next;
		}
		
	}
}
