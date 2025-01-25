import java.util.*;
import java.io.*;

public class main{
     // count binary substring
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] arr = new int[2][n+1];
        arr[0][1] = 1;
        arr[1][1] = 1;
        for(int j = 2; j < arr[0].length; j++){
            for(int i = 0; i <arr.length; i++){
                if(i == 0){
                     arr[i][j] = arr[i+1][j-1];
                }else{
                    arr[i][j] = arr[i][j-1] + arr[i-1][j-1];
                }
            }    
        }
        
        System.out.print(arr[0][n] + arr[1][n]);
    } 
}