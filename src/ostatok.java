import java.util.Scanner;

public class ostatok {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        for(;a<=b;a++){
            if(a%d == c){
                System.out.print(a + " ");
            }
        }
    }
}
