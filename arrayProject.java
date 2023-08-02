import java.util.*;
public class arrayProject{
    int arr[]=null;
    Scanner sc=new Scanner(System.in);
    public arrayProject(int n){
        this.arr=new int [n];
        for(int i=0; i<n;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insertValue(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Enter " + i +" day's temperature: ");
            arr[i]=sc.nextInt();
        }
    }
    public void calAndTellAvg(int n){
        int tot=0, avg=0, count=0;
        for(int i=1; i<=n;i++){
            tot +=arr[i];
        }
        avg=tot/n;
        System.out.println("The average temperature of the given data is : " + avg);
        for(int i=1; i<=n;i++){
            if(arr[i]>avg){
                count++;
            }
            System.out.println("The number of days which had temperature more than average : " + count);
        }
    }
}