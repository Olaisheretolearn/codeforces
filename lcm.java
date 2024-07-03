import java.util.Scanner;

public class lcm {
    public static void main(String [] args ){
        Scanner kb = new Scanner(System.in);
        String [] input = kb.nextLine().split(" ");
        int firstnumber = 0;
        int secondnumber  = 0;
        for(int i = 0; i < input.length; i++){
            firstnumber = Integer.parseInt(input[0]);
            secondnumber = Integer.parseInt(input[1]);
        }

        int lcmResult = lcmm(firstnumber, secondnumber);

        System.out.println(lcmResult);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcmm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
