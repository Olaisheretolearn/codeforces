import java.util.Scanner;

public class ugly {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestcases = kb.nextInt();
        kb.nextLine();

        for (int q = 0; q < numOfTestcases; q++) {
            int wordLength = kb.nextInt();
            kb.nextLine();

            String str = kb.nextLine();

            
            int minRemovals = minRemovalsToMakeBeautiful(str);
            System.out.println(minRemovals);
        }
    }

    
    public static int minRemovalsToMakeBeautiful(String str) {
        int n = str.length();
        int minRemovals = 0;

        
        for (int i = 0; i < n; i++) {
            
            if (i <= n - 3 && (str.substring(i, i + 3).equals("pie") || str.substring(i, i + 3).equals("map"))) {
                // If yes, increment minRemovals and skip the next two characters
                minRemovals++;
                i += 2;
            }
        }

        return minRemovals;
    }
}
