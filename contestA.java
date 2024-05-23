import java.util.Scanner;

public class contestA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();

        for (int i = 0; i < numOfTestCases; i++) {
            String[] chars = kb.nextLine().split(" ");
            int n = Integer.parseInt(chars[0]);
            int k = Integer.parseInt(chars[1]);
            solve(n, k);
        }
    }

    public static void solve(int n, int k) {
        if (n == k) {
            for (int i = 0; i < n; i++) {
                System.out.print("1 ");
            }

            System.out.println(); 

        } else {
            if (k >= 2) {
                System.out.println("-1");
                return;
                
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
    }
}
