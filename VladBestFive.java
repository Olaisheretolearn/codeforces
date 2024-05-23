import java.util.Scanner;


public class VladBestFive{
    public static void main(String [] args ){
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        kb.nextLine();
        

        for(int i = 0; i < number; i++){
            String temp =  kb.nextLine();
            System.out.println(counter(temp));
        }
    }

    public static char counter(String s ){
        int Acounter = 0;
        int Bcounter = 0;
       for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                Acounter++;
            }else {
                Bcounter++;
            }
       }

       if(Acounter > Bcounter){
        return 'A';
       } else {
        return 'B';
       }


    }
}