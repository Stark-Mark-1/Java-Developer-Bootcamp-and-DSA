package DSA.Arrays;
import java.util.*;

public class Array2d{
    int arr[][]=null;
    public Array2d(int numOfRow, int numOfCol){
        this.arr =new int[numOfRow][numOfCol];
        for(int r=0; r< numOfRow; r++){
            for(int c=0; c<numOfCol; c++){
                arr[r][c]= Integer.MIN_VALUE;
            }
        }
    }
    
    public void insertValueInTheArray(int row, int col, int val){ // here row and col denote the index values at which the value will be stored
        try{
            if(arr[row][col]==Integer.MIN_VALUE){ // Here we are checking if the cell is empty or not
                arr[row][col]= val;
                System.out.println("Value Inserted !");
            }else{
                System.out.println("The cell is full!");
            }
        }catch (ArrayIndexOutOfBoundsException e){ //here we are checking whether the index value provided in available in array or not!
            System.out.println("Invalid Index value");
        }
    }
    public void accessTheArray(int row, int col){ // function to access the value of a cell in 2d array
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                System.out.println("The cell is empty");
            }else{
                System.out.println(arr[row][col]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }
    public void traverseTheArray(){
        for(int row=0; row < arr.length; row ++){
            for(int col =0 ; col<arr.length;col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public void findElementInTheArray(int val){
        for(int r=0; r< arr.length; r++){
            for(int c=0; c<arr.length; c++){
                if(arr[r][c]== val){
                    System.out.println("The elemement is present at row: " + r +" c: " + c);
                }else{
                    System.out.println("The element is not present in Array");
                }
            }
        }
    }
    public void deleteElementFromArray(int row, int col){
        try{
            arr[row][col]=Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invvalid Cell");
        }
    }

   // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int [][] int2dArray = new int[2][2];
    //     int2dArray[0][0]=1;
    //     int2dArray[0][1]=2;
    //     int2dArray[1][0]=3;
    //     int2dArray[1][1]=4;
    //     System.out.println(Arrays.deepToString(int2dArray));
    // }
}