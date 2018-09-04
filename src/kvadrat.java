import java.util.Scanner;

public class kvadrat {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();

        for(int w = a; w<=b; w++){
            double x = Math.sqrt(w);
            double y = Math.sqrt(w);
            if(x==y){
                System.out.print(w + " ");
            }
        }
    }
}
