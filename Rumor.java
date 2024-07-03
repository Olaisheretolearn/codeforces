import java.util.Scanner;

public class Rumor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String initial = scanner.nextLine();
        String finalStr = scanner.nextLine();
        
        boolean isPossible = checkRumor(n, initial, finalStr);
        
        System.out.println(isPossible ? "YES" : "NO");
        
        scanner.close();
    }
    
    public static boolean checkRumor(int n, String initial, String finalStr) {
        int lenDiff = Math.abs(initial.length() - finalStr.length());
        
        // If the length difference is greater than n, it's impossible
        if (lenDiff > n) {
            return false;
        }
        
        int minLen = Math.min(initial.length(), finalStr.length());
        int commonPrefixLength = 0;
        
        // Find the length of the common prefix
        for (int i = 0; i < minLen; i++) {
            if (initial.charAt(i) != finalStr.charAt(i)) {
                break;
            }
            commonPrefixLength++;
        }
        
        int remainingChanges = n - lenDiff;
        int diffChars = Math.max(initial.length(), finalStr.length()) - commonPrefixLength;
        
        // Check if the remaining changes are sufficient and of correct parity
        return diffChars <= remainingChanges && remainingChanges % 2 == diffChars % 2;
    }
}