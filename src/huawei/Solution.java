package huawei;


import javax.swing.tree.TreeNode;

//package huawei;
//
//public class Solution {
//    /**
//     * 交换数组里n和0的位置
//     * 
//     * @param array
//     *            数组
//     * @param len
//     *            数组长度
//     * @param n
//     *            和0交换的数
//     */
//    // 不要修改以下函数内容
//    public void swapWithZero(int[] array, int len, int n) {
//        Main.SwapWithZero(array, len, n);
//    }
//    // 不要修改以上函数内容
//
//
//    /**
//     * 通过调用swapWithZero方法来排
//     * 
//     * @param array
//     *            存储有[0,n)的数组
//     * @param len
//     *            数组长度
//     */
//    public void sort(int[] array, int len) {
//        // 完成这个函数
//    	for(int i = len-1;i>0;i--){
//    		swapWithZero(array, len, array[i]);
//    		//找到剩下最大的
//    		int max = -1;
//    		for(int j =0;j<i;j++){
//    			if(array[j]>max){
//    				max = array[j];
//    			}
//    		}
//    		swapWithZero(array, len, max);
//    	}
//        
//    }
//    public static void main(String[] args){
//    	Solution s = new Solution();
//    	s.sort(new int[]{3,8,2,4,5,0,1,7,9,6} , 10);
//    }
//}
//import java.util.Stack;
//
//public class Solution {
//    Stack<Integer> s1 = new Stack<Integer>();
//    Stack<Integer> s2 = new Stack<Integer>();
//
//    int min = Integer.MAX_VALUE;
//    public void push(int node) {
//        if(node<=min){
//        	min = node;
//        	s2.push(min);
//        }
//        s1.push(node);
//        
//    }
//    
//    public void pop() {
//    	int top = s1.peek();
//    	if(top==min){
//    		s2.pop();
//    		min = s2.peek();
//    	}
//        s1.pop();
//    }
//    
//    public int top() {
//        return s1.peek();
//    }
//    
//    public int min() {
//        return min;
//    }
//}
import java.util.*;
public class Solution {
    char[] a;
    HashSet<String> set = new HashSet<String>();
    int len = 0;
    public static void main(String[] args){
    	Solution s = new Solution();
    	s.Permutation("aa");
    }
    public ArrayList<String> Permutation(String str) {
        len = str.length();
        if(len==0) return new ArrayList<String>();
        a = new char[len];
        for(int i=0;i<len;i++){
            a[i] = '#';
        }
        fun(0,str);
        ArrayList<String> ls = new ArrayList<String>();
        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr);
        for(String s:arr){
            ls.add(s);
        }
        
       return ls;
    }
    private void fun(Integer m,String str){
        if(m==len){
            set.add(new String(a));
        }else{
            for(int i=0;i<len;i++){
                if(a[i]=='#'){
                    a[i] = str.charAt(m);
                    fun(m+1,str);
                    a[i]='#';
                }
            }
        }
    }
}