package DSA.Arrays;

import java.util.*;
public class arrayCodingExcercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Q1. Middle Function Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
        // int n=sc.nextInt();
        // int arr[]= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int arr2[]=new int[n-2];
        // for(int i=1; i<n-1;i++){
        //     arr2[i-1]=arr[i];
        // }
        // System.out.println(Arrays.toString(arr2));
        // Q2. Given 2D array calculate the sum of diagonal elements.
        // int m=sc.nextInt();
        // int n=sc.nextInt();
        // int arr[][]= new int [m][n];
        // int sum=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //       if(i==j){
        //         sum +=arr[i][j];
        //       }
        //     }
        // }
        // System.out.println(sum);
        // Q3. Given an array, write a function to get first, second best scores from the array and return it in new array.
        // int n=sc.nextInt();
        // int arr []= new int [n];
        // int high []= new int [2];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0; i<n;i++){
        //     if(arr[i]>high[0]){
        //         high[0]=arr[i];
        //     }else if(arr[i]>high[1]){
        //         high[1]=arr[i];
        //     }
        // }System.out.println(Arrays.toString(high));
        // Q4. Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
        // int n=sc.nextInt();
        // int arr[]= new int [n-1];
        // int missing=0;
        // for(int i=0;i<n-1;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=1;i<n;i++){
        //     if(i!=arr[i]){
        //         missing=i;
        //     }
        // }if(missing==0){
        //     System.out.println("No number missing");
        // }else{
        //     System.out.println(missing);
        // }
        // Q5. Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
        int arr[]={1,1,22,22,3,3,4,5,5,6,6,7};
        int n=arr.length;
        
    }
}
