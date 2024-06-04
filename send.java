import java.util.Scanner;

public class send {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestcases = kb.nextInt();
        kb.nextLine();

        for (int q= 0; q < numOfTestcases; q++) {
            String[] ess = kb.nextLine().split(" ");

            int n = Integer.parseInt(ess[0]);
            int f = Integer.parseInt(ess[1]);
            int a = Integer.parseInt(ess[2]);
            int b = Integer.parseInt(ess[3]);

            int[] m = new int[n + 1];
            m[0] = 0;
            String[] scubes = kb.nextLine().split(" ");
            for (int k = 1; k <= n; k++) {
                m[k] = Integer.parseInt(scubes[k - 1]);
            }

            for (int i = 1; i <= n; i++) {
                f -= Math.min(b, a * (m[i] - m[i - 1]));
                if (f <= 0) {
                    System.out.println("NO");
                    break;
                }
            }
            if (f > 0) {
                System.out.println("YES");
            }
        }
    }
}
