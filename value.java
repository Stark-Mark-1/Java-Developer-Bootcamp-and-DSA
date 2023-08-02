import java.util.*;
public class value {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please tell the number of days for which you want to enter temperature ");
        int n=sc.nextInt();
        arrayProject obj = new arrayProject(n);
        obj.insertValue(n);
        obj.calAndTellAvg(n);
    }
}
