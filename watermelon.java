import java.util.Scanner;
public class watermelon{
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int w = scnr.nextInt();
        scnr.nextLine();

        if(w <= 2){
            System.out.println("NO");
       } else if(w % 2 == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        
    }
}