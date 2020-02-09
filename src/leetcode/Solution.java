package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.ListUI;

public class Solution {
	
	public static void main(String[] args){
		new Solution().longestPalindrome("c");
		List list = new ArrayList();
		StringBuffer sb = new StringBuffer();
		Map map = new HashMap();
		Set<String> set = new HashSet<String>();
		set.clear();
		new ArrayList<String>(set);
		
	}
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0)return "";
        int len = s.length();
        boolean[][] table = new boolean[len][len];
        int maxLen = 1;
        int start =0;
       for(int i=0;i<len;i++){
           table[i][i] = true;
           for(int j=0;j<i;j++){
               table[i][j] = s.charAt(i)==s.charAt(j)&&((i-j)<2||table[i-1][j+1]);
               if(table[i][j]){
                   if( (i-j+1)>maxLen){
                       start = j;
                       maxLen = i-j+1;
                   }
                   
                   
               }
           }
       }
       System.out.println(s.substring(start,start+maxLen));
       return s.substring(start,start+maxLen);
    }
    
}