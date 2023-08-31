public class sorting {
    // void bubble(int arr[]){
    //     int n=arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }
    void selection(int arr[]){
        for(int j=0;j<arr.length;j++){
            int minIndex=j;
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]<arr[minIndex]){
                    minIndex=i;
                }
            }
            if(minIndex !=j){
                int temp=arr[j];
                arr[j]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}