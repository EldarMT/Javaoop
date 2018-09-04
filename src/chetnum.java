

import java.util.Scanner;

public class chetnum {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();

        for(;a<=b;a++){
            if(a%2==0){
                System.out.print(a + " ");
            }
        }
    }
}
