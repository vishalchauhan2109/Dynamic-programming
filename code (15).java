import java.util.*;
import java.io.*;

public class main{
     //Tiling with M x 1 Tiles Dynamic Programming
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int []arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] < min){
                min = arr[i];
            }
            
            pist = arr[i] - min;
            
            
            if(pist > op){
                op = pist;
            }
           
        }
        System.out.println(op);
        
        
    } 
}