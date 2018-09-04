import java.util.Scanner;

public class koldel {
    public static void main ( String args [ ]){
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        int cnt = 0 ;
        for (int i =1; i<=x;i++){
            if(x%i ==0 ){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
