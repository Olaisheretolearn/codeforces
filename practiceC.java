import java.util.Scanner;

public class practiceC {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine(); 

        for (int i = 0; i < numOfTestCases; i++) {
            int arrLength = kb.nextInt();
            kb.nextLine(); 

            String[] sLine = kb.nextLine().split(" ");
            long[] aux = new long[arrLength];
            for (int m = 0; m < arrLength; m++) {
                aux[m] = Long.parseLong(sLine[m]);
            }
            System.out.println(maxSum(aux));
        }
        kb.close();
    }

    public static long maxSum(long[] array) {
        long currSum = 0;

        
        for (int i = 0; i < array.length; i++) {
            currSum += array[i];
        }

        long hiSum = currSum; 

        
        for (int i = 0; i < array.length - 1; i++) {
            long origLeft = array[i];
            long origRight = array[i + 1];

           
            long newLeft = -origLeft;
            long newRight = -origRight;

        
            long newSum = currSum - origLeft - origRight + newLeft + newRight;

          
            hiSum = Math.max(hiSum, newSum);
        }

        return hiSum;
    }
}