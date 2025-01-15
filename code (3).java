import java.util.*;
import java.io.*;

public class main{
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        
        int[] dp = new int[target+1];
        dp[0] = 1;
        
        for(int j = 1; j < dp.length; j++){    
            for(int i = 0; i < arr.length; i++){
                
                if(arr[i] <= j){
                dp[j] += dp[j - arr[i]];
                }
            }
        }
        
        System.out.println(dp[target]);
        
    } 
}