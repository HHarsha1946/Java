import java.util.Scanner;

public class revNumber{
    public static void main (String[] args){
        int number, reverseNumber =0,remainder;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number");
        number = scan.nextInt();
        scan.close();
        
        while(number > 0){
        remainder = number % 10;
        number = number /10;
        reverseNumber = (reverseNumber *10)+ remainder;
    }
    System.out.print(reverseNumber);
}
}