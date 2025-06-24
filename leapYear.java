    import java.util.Scanner;
    
    public class leapYear {
        public static void main (String [] args){
            int year;
            boolean leap = false;
            System.out.print("Enter a year : ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            sc.close();
            
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0)
                        leap = true;
                } 
                    leap = true;
                }
                System.out.println(year + " is a leap year : " + leap);
            }
        }
