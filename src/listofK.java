import java.util.Scanner;

public class listofK {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for(int i= 1; i<=n;++i){
            double x = Math.sqrt(i);
            double y = Math.sqrt(i);
            if(x==y){
                System.out.println(i);
            }
        }
    }
}
