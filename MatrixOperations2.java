import java.util.*;
public class MatrixOperations2 {
        public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        int[][] add= new int[n][n];
        int[][] sub = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                add[i][j] = arr1[i][j] + arr2[i][j];
                sub[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        int [][] mul = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Matrix Addition:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(add[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Subtraction:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Multiplication:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}

