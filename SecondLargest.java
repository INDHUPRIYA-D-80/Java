import java.util.*;
public class SecondLargest {
    // You are using Java

    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
               if(arr[j]<arr[j-1]){
                   int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               } 
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }
        System.out.println(arr[n-2]);
    }
}
    
