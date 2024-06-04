import java.util.Scanner;

public class make {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();

        for (int i = 0; i < numOfTestCases; i++) {
            int realSize = kb.nextInt();
            kb.nextLine(); 

            String[] nums = kb.nextLine().split(" ");
            int[] realInt = new int[realSize];


            for (int j = 0; j < realSize; j++) {
                realInt[j] = Integer.parseInt(nums[j]);
            }

            int min = realInt[0];
            int max = realInt[0];

            for (int m = 1; m < realSize; m++) {
                min = Math.min(min, realInt[m]);

                max = Math.max(max, realInt[m]);
            }

            if (min == max) {
                System.out.println(0);
            } else {
                int cost = 0;
                int start = 0;
                for (int k = 0; k < realSize; k++) {
                    if (realInt[k] == min || realInt[k] == max) {
                        int length = k - start;


                        cost = Math.max(cost, length);
                        start = k + 1;


                    }
                }
                cost = Math.max(cost, realSize - start);

                System.out.println(cost);
            }
        }
    }
}
