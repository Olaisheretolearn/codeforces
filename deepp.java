import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class deepp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();  // Consume the newline

        for (int q = 0; q < numOfTestCases; q++) {
            int ships = kb.nextInt();
            long totAttack = kb.nextLong();
            kb.nextLine();  // Consume the newline

            int[] array = new int[ships];
            for (int m = 0; m < ships; m++) {
                array[m] = kb.nextInt();
            }
            kb.nextLine();  // Consume the newline

            System.out.println(sink(array, totAttack, array.length));
        }

        kb.close();  // Close the scanner
    }

        public static int sink(int [] array, long k, int n){
        // Create and populate a Deque
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            dq.addLast(array[i]);
        }

        int ans = 0;
        while(dq.size() > 0 && k > 0) {
            int mn = Math.min(dq.peekFirst(), dq.peekLast());

            if(k >= 2 * mn){
                int front = dq.pollFirst() - mn;
                int back = dq.pollLast() - mn;
                if (front > 0) dq.addFirst(front);
                if (back > 0) dq.addLast(back);
                k -= 2 * mn;
            } else {
                int front = dq.pollFirst();
                int back = dq.pollLast();
                front -= (k + 1) / 2;
                back -= k / 2;
                if (front > 0) dq.addFirst(front);
                if (back > 0) dq.addLast(back);
                k = 0;
            }

            ans = n - dq.size();
        }
        return ans;
    }
}



