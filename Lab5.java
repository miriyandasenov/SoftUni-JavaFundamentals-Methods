import java.util.Scanner;

public class Lab5
{
	public static void printBill(String product,int quantity){

		switch(product){
			case "coffee":
				System.out.println(String.format("%.2f", quantity*1.5));
				break;
			case "water":
				System.out.println(String.format("%.2f", quantity*1.0));
				break;
			case "coke":
				System.out.println(String.format("%.2f", quantity*1.4));
				break;
			case "snacks":
				System.out.println(String.format("%.2f", quantity*2.0));
				break;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String product = sc.nextLine();
		int quantity = Integer.parseInt(sc.nextLine());

		printBill(product, quantity);
	}
}