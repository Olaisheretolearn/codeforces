import java.util.Arrays;
import java.util.Scanner;

public class differentArray{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int numOfTestCases = kb.nextInt();
        kb.nextLine();

        for(int k = 0; k < numOfTestCases ; k++){

        String[] sizes = kb.nextLine().split(" ");

        int array1size = Integer.parseInt(sizes[0]);
        int array2size = Integer.parseInt(sizes[1]);



        int [] array1 = new int[array1size];
        int [] array2 = new int [array2size];


        //populate array1;
        String[] array1Elements = kb.nextLine().split(" ");
            for (int i = 0; i < array1size; i++) {
            array1[i] = Integer.parseInt(array1Elements[i]);
        }

        //populate array2

        String[] array2Elements = kb.nextLine().split(" ");
        for (int i = 0; i < array2size; i++) {
            array2[i] = Integer.parseInt(array2Elements[i]);
        }


        System.out.println(distance(array1, array2));

    }


    }

    public static int distance(int[] array1 , int [] array2){
        int a1left = 0;
        int a1right = array1.length - 1;

        int a2left = 0;
        int a2right = array2.length -1;

        Arrays.sort(array1);
        Arrays.sort(array2);

        int sum =  0;


        while(a1left <= a1right){

             if (a1left == a1right) {
        int tempSumMiddle = array1[a1right] - array2[a2left];
        int anotherTemp = array1[a1right] - array2[a2right];
        sum += Math.max(Math.abs(tempSumMiddle), Math.abs(anotherTemp));
        break;
    }

          int tempSum1 =  array1[a1right] - array2[a2left];
          sum += Math.abs(tempSum1);
          int tempSum2 =  array1[a1left] - array2[a2right];
          sum+=Math.abs(tempSum2);
          a1left++;
          a1right--;
          a2left++;
          a2right--;
        }


       

        return sum;
    }
}