import java.util.*;
public class DiceJack {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d,e,f;
        d=(int)Math.random();
        e=(int)Math.random();
        f=(int)Math.random();
        int sum1=a+b+c , sum2=d+e+f;
        if( sum1 > sum2 ){
            System.out.println("User won");
        }
        else{
            System.out.println("Computer Won");
        }
   } 
}
