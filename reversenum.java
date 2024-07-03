import java.util.Scanner;

public class reversenum {
        public static void main(String [] args ){
        Scanner kb = new Scanner(System.in);
        String [] input = kb.nextLine().split(" ");
        int firstnumber = 0;
        int secondnumber  = 0;
        for(int i = 0; i < input.length; i++){
            firstnumber = Integer.parseInt(input[0]);
            secondnumber = Integer.parseInt(input[1]);
        }

        int ans  = add(firstnumber, secondnumber);
        System.out.println(ans);
    }

        public static int reverse(int num){
            int reversed = 0;

            while (num != 0){
                //get last digit 
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                //divide by 10
                num = num/10;
            }
            return reversed;
        }

        public static int add(int a , int b){
            int first = a;
            int second = reverse(b);

            return first + second;
        }
    }

