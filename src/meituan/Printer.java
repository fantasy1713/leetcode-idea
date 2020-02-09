package meituan;

import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
       int[] result = new int[n*n];
       int i = 0,j = n-1;
       int pos =0;
       int gap  =n-1;
       for(;gap>=0;gap--){
    	   for(int k =0;k<n-gap;k++){
    		   result[pos++] = arr[k][k+gap];
    	   }
       }
       for(gap=1;gap<n;gap++){
    	   for(int k = 0;k<n-gap;k++){
    		   result[pos++] = arr[k+gap][k];
    	   }
       }
       return result;
    }
}