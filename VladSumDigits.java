import java.util.Scanner;
public class VladSumDigits{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();
        for(int i = 0; i < numOfTestCases; i++){

        
        int number = kb.nextInt();
        kb.nextLine();

        System.out.println(breaking(number));
    }
    }
        public static int breaking(int number){
            int sum = 0;
            while(number > 0){
            if(number <10){
                sum = number* (number +1)/2;
            }

             if(number > 9){
                sum +=45;
                number = number - 9;
                
             }




            }
            
            return sum;
        }

}