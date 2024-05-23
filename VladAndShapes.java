import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VladAndShapes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine().trim());

        for (int k = 0; k < numOfTestCases; k++) {
            int dimension = Integer.parseInt(br.readLine().trim());
            int[][] test = new int[dimension][dimension];

            // Reading the input array
            for (int m = 0; m < dimension; m++) {
                String line = br.readLine().trim();
                for (int n = 0; n < dimension; n++) {
                    test[m][n] = Character.getNumericValue(line.charAt(n));
                }
            }

            // Check if it's a square or a triangle
            boolean isTriangle = isTriangle(test);

            // Output the result
            if (isTriangle) {
                System.out.println("TRIANGLE");
            } else {
                System.out.println("SQUARE");
            }
        }
    }

    // Check if the shape is a triangle
    private static boolean isTriangle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount == 1) {
                return true;
            }
        }
        return false;
    }
}
