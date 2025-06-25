import java.util.Scanner;
public class addition
{
	public static void main(String[] args) {
	    int num1, num2;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st number");
	    num1 = sc.nextInt();
	    System.out.print("Enter 2nd number");
	    num2 = sc.nextInt();
	    
	    
		System.out.println("addition :" + (num1 + num2));
	}
}