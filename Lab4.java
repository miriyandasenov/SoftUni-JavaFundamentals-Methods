import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());

		switch( command ){

			case "add":
				add(n1,n2);
				break;
			case "multiply":
				multiply(n1,n2);
				break;
			case "subtract":
				subtract(n1,n2);
				break;
			case "divide":
				divide(n1,n2);
				break;
		} 
	}

	public static void add(int a, int b){
		System.out.println(a+b);
	}

	public static void multiply(int a, int b){
		System.out.println(a*b);
	}

	public static void subtract(int a, int b){
		System.out.println(a-b);
	}

	public static void divide(int a, int b){
		System.out.println(a/b);
	}
}