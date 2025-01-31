import java.util.*;
import java.io.*;

public class main{
     // Paint House (Leetcode) Dynamic Programming | Explained with Code

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        
        int [][]arr = new int[n][m];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int [][] dp = new int[n][m];
        for(int j = 0; j < arr[0].length; j++){
            dp[0][j] = arr[0][j];
        }
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                
                int small = Integer.MAX_VALUE;
                for(int k = 0; k < dp[0].length; k++){
                    if(k != i){
                        if(dp[i-1][k] < small){
                            small = dp[i-1][k];
                        }
                    }
                    
                }
                dp[i][j] = arr[i][j] + small;
            }    
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr[0].length; i++){
            if(dp[n-1][i] < ans){
                ans = dp[n-1][i];
            }
            
        }
       
        System.out.println(ans);
        
       
       
      
    } 
}