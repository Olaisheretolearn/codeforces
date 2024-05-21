import java.util.Scanner;
public class longwords{
    public static void main(String [] args ){
        Scanner scnr = new Scanner(System.in);
        int arraySize = scnr.nextInt();
        scnr.nextLine();
        String[] real = new String[arraySize];
        
    String temp;
        for(int i = 0; i < real.length;i++){
            temp = scnr.nextLine();
            real[i] = temp;

        }

        shorten(real);

        for(int i = 0; i <  real.length ; i++){
            System.out.println(real[i]);
        }

        scnr.close();

    }



    public static void shorten(String [] array){
        int n = array.length;

        for(int i = 0; i < array.length; i++){
            if(array[i].length() > 10){
                array[i] = array[i].charAt(0) + String.valueOf(array[i].length() - 2) + array[i].charAt(array[i].length()-1);
            } 
        }
    }
}