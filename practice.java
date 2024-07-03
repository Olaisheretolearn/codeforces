import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();  // Consume the newline


      
        for (int q = 0; q < numOfTestCases; q++) {
            long columns  = 0;
            long maxWater = 0;
            
            String [] fLine  = kb.nextLine().split(" ");
                columns = Long.parseLong(fLine[0]);
                maxWater = Long.parseLong(fLine[1]);

                //populate column array
                String [] secondLine = kb.nextLine().split(" ");
                long [] aux  = new long[(int)columns];
            for(int j = 0; j < columns; j++){
                aux[j] = Long.parseLong(secondLine[j]);
        }

       
        System.out.println(ready(aux,maxWater));

        }

        
        
    }

    public static long ready(long[] array, long maxValue) {
        // Initialize low and high based on the minimum and maximum values in the array
        long low = array[0];
        long high = array[0];

        for (long num : array) {
            if (low > num) {
                low = num;
            }
            if (high < num) {
                high = num;
            }
        }

        // Adjust high to account for the maximum allowable difference
        high += maxValue;

        long bestX = low;

        // Binary search loop
        while (low <= high) {
            long mid = (low + high) / 2;
            long sumOfDiff = 0;

            for (long num : array) {
                if (num <= mid) {
                    sumOfDiff += (mid - num);
                    if (sumOfDiff > maxValue) {
                        break;
                    }
                }
            }

            if (sumOfDiff <= maxValue) {
                bestX = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return bestX;
    }
}