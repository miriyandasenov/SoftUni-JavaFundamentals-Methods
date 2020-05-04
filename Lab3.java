import java.util.Scanner;

public class Lab3
{
	public static void printRow(int rowCount){
		for(int i = 0; i < rowCount; i++){
			System.out.printf("%d ", i+1);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < number; i++){
			printRow(i+1);
		} 

		for(int i = number - 1; i > 0; i--){
			printRow(i);
		}
	}
}