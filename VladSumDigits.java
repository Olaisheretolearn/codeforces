import java.util.Scanner;
public class VladSumDigits{
 static long [] arr = new long[200005 + 1];
    public static void main(String [] args){
            //precompute 
            
            arr[0] = 0;

            for(int i = 1; i < arr.length; i++){
                arr[i] = arr[i-1] + digits(i);
            }



        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();


        for(int i = 0; i < numOfTestCases; i++){
 
        
        int number = kb.nextInt();
        kb.nextLine();
        
    result(number);

    }
 

    
}

   
 public static void result(int num){
    System.out.println(arr[num]+ "\n");
 }


    public static long digits(long num){
        long sum = 0;
        while(num > 0){
            long digit = num % 10;
            sum+=digit;
            num = num /10;
        }
        return sum;
    }
 
}