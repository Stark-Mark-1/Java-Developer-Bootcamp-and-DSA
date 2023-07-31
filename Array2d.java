import java.util.*;

public class Array2d{
    int arr[][]=null;
    public Array2d(int numOfRow, int numOfCol){
        this.arr =new int[numOfRow][numOfCol];
        for(int r=0; r< arr.length; i++){
            for(int c=0; c<arr.length; c++){
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