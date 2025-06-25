import java.util.Scanner;
public class sumOfNumbers{
    public static void main (String[] args){
        int count;
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number : ");
            count = sc.nextInt();
            int number,sum=0;
            
            for(int i = 0; i<count; i++){
                number = sc.nextInt();
                sum = sum + count;
            }
            System.out.print("Sum of number : "+ sum);
        }
}
