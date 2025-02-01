import java.util.*;
import java.io.*;

public class main{
     // Paint Fence (Leetcode) Dynamic Programming | Explanation with Code

     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int same = k*1;
        int diff = k*(k-1);
        int total = same + diff;
        
        for(int i = 3; i <= n; i++){
            int newsame = diff;
            int newdiff = (same + diff)*(k-1);
            
            same = newsame;
            diff = newdiff;
            total = same + diff;
        }
        System.out.println(total);
    } 
}