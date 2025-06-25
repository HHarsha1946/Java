/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class findingAverage
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int count = sc.nextInt();
		int number,sum = 0;
		float  average = 0;
		
		for(int i =0; i < count; i++){
		    number = sc.nextInt();
		    sum = number + sum;
		    average = sum /count;
		}
		System.out.println("average : " + average);
	}
}