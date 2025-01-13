import java.util.*;
import java.io.*;

public class main{
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        
        int []arr = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int m = target + 1;
        int n = s + 1;
        boolean [][]dp = new boolean[n][m];
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(j == 0){
                    dp[i][j] = true;
                }
                else if(i == 0 && j != 0){
                    dp[i][j] = false;
                    
                }else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }else{
                    int val = arr[i-1];
                    
                    if(j >= val){
                        if(dp[i-1][j-val] == true){
                            dp[i][j] = true;
                        }
                    }
                    
                }
                
            }
            
           
        }
         System.out.println(dp[n-1][target]);
        
    } 
}