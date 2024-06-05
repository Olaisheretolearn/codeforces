import java.util.Scanner;

public class deep {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();  // consume the newline

        for (int q = 0; q < numOfTestCases; q++) {
            String[] input = kb.nextLine().split(" ");
            int ships = Integer.parseInt(input[0]);
            int totAttack = Integer.parseInt(input[1]);

            String[] sarray = kb.nextLine().split(" ");
            int[] array = new int[ships];
            for (int m = 0; m < sarray.length; m++) {
                array[m] = Integer.parseInt(sarray[m]);
            }

            System.out.println(sink(array, totAttack));
        }
    }

    public static int sink(int[] array, int attack) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right && attack > 0) {
            // Attack from the left
            if (array[left] > 0 && attack > 0) {
                array[left] -= 1;
                attack--;
            }

           
            if (array[right] > 0 && attack > 0 && left != right) {
                array[right] -= 1;
                attack--;
            }

           
            if (array[left] == 0) {
                left++;
            }

            if (array[right] == 0) {
                right--;
            }
        }

        // Count the number of sunk ships (zeroes)
        int count = 0;
        for (int k : array) {
            if (k == 0) {
                count++;
            }
        }
        return count;
    }
}
