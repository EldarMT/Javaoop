import java.util.Scanner;

public class F3 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int x , y;
        x = input.nextInt();
        y = input.nextInt();


      boolean m = (x == 1 & y== 0 || x ==0 & y==1);
      if(m == true){
          System.out.print(1);
      }else{
          System.out.print(0);
      }
    }
}
