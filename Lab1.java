import java.util.Scanner;

public class Lab1
{
	public static void printSign(int n){
		if( n > 0 ) System.out.println(String.format("The number %d is positive.", n));
		else if( n < 0 ) System.out.println(String.format("The number %d is negative.", n));
		else System.out.println(String.format("The number %d is zero.", n));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());

		printSign(number);
	}
}