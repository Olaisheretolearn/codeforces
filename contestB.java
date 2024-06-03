import java.util.*;
public class contestB{
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int numOfTestCases = kb.nextInt();
    kb.nextLine();


    for(int i = 0; i < numOfTestCases; i++){
        String[] nums = kb.nextLine().split(" ");
        int numOfCubes = Integer.parseInt(nums[0]);
        int favIndex = Integer.parseInt(nums[1]);
        int nremoved = Integer.parseInt(nums[2]);

        String [] cubes = kb.nextLine().split(" ");
        int[]realCubes = new int[cubes.length];
        for(int j = 0; j < cubes.length; j++){
            realCubes[j] = Integer.parseInt(cubes[j]);
        }

        System.out.println(removed(realCubes,favIndex,nremoved));

    }
    }



public static String removed(int[] arrays, int fav, int remove) {
    int favElement = arrays[fav - 1]; 
    Arrays.sort(arrays); 
    reverse(arrays); 

    int newFavIndex = -1;
    for (int i = 1; i < arrays.length; i++) {
        if (arrays[i] == favElement) {
            newFavIndex = i;
            break;
        }
    }

    if (arrays[newFavIndex]== arrays[newFavIndex+1]) {
        return "MAYBE";
    } else if (newFavIndex >= remove) {
        return "NO";
    } else {
        return "YES";
    }
}







public static void reverse(int [] arrays){
int left = 0;
int right = arrays.length -1;

while(left <= right){
    int temp = arrays[left];
    arrays[left] = arrays[right];
    arrays[right] = temp;
    left++;
    right--;
}
}
}
