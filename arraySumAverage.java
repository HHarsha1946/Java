/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class arraySumAverage
{
	public static void main(String[] args) {
	    int[] numberArray = {11,12,18,14};
	    int numberArraylength = numberArray.length;
	    int sum = 0;
	    for(int i= 0; i< numberArraylength; i++){
	        sum = sum + numberArray[i];
	    }
		System.out.println("Sum of Array is : " + sum);
		float average = (float)sum / numberArraylength;
		System.out.println("average of Array is : " + average);
	
	}
}