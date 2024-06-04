import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VladProb {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine(); 

        for (int j = 0; j < numOfTestCases; j++) {
            String[] nums = kb.nextLine().split(" ");
            int problems = Integer.parseInt(nums[0]);
            int rounds = Integer.parseInt(nums[1]);
            String fullSetString = "ABCDEFG";

            String sprob = kb.nextLine();
            

            Map<Character, Integer> freqMap = calculateFrequency(sprob);

            int totalDeficit = 0;
            for (char c : fullSetString.toCharArray()) {
                int currentFreq = freqMap.getOrDefault(c, 0);
                if (currentFreq < rounds) {
                    totalDeficit += (rounds - currentFreq);
                }  
            }

            System.out.println(totalDeficit);
        }
    }

    public static Map<Character, Integer> calculateFrequency(String input) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            freq.put(currentChar, freq.getOrDefault(currentChar, 0) + 1);
        }
        return freq;
    }
}
