import java.util.Scanner;
public class numberToWord {
    
    private static final String[] units = {
        "","One","Two","Three","Four","Five","Six","Seven","Eight",
        "Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
        "Sixteen","Seventeen","Eighteen","Nineteen"
    };
    private static final String[] tens ={
        "","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy",
        "Eighty","Ninety"
    };
    
    public static String convert(int number){
        if(number == 0){
            return "Zero";
        }
        if(number < 0){
            return "Minus"+convert(-number);
        }
        String words ="";
        if((number /1000) >0){
            words += convert(number/1000)+" Thousand";
            number %= 1000;
        }
        if((number /100)>0){
            words += convert(number /100)+ " Hundered";
            number %= 100;
        }
        if(number > 0){
            if(!words.isEmpty()){
                words += " and";;
            }
            if(number < 20){
                words += units[number];
            }else{
                words += tens[number / 10];
                if((number %10 )>0){
                    words += "-"+ units[number % 10];
                }
            }
        }
        return words.trim();
    }
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number");
            int num = sc.nextInt();
            System.out.print("in words: " +convert(num));
            sc.close();
        }
}