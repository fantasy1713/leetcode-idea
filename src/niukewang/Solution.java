package niukewang;

import java.util.Scanner;

import java.util.Stack;
//
//public class Solution {
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//    
//    public void push(int node) {
//        stack1.push(node);
//        
//    }
//    
//    public int pop() {
//    	if(stack2.size()==0){
//            int count = stack1.size();
//            for(int i= 0;i<count;i++){
//                stack2.push(stack1.pop());
//            }   
//        }
//        return stack2.pop();
//        
//    }
//    public static void main(String[] args){
//    	 Stack<Integer> stack3 = new Stack<Integer>();
//    	 stack3.pop();
//    }
//}
//public class Solution{
//    public static void main(String[] args){
////    	Scanner s = new Scanner(System.in);
////    	
////        int n =s.nextInt();
////        n = n>1000?999:n;
////        System.out.println(last(n));
//    	IsPopOrder(new int[]{1,2,3,4,5,},new int[]{4,3,5,2,1});
//    }
//    public static int last(int n){
//    	int lastIndex = 0;
//    	int[] a =new int[n];
//    	int pos = n-1;
//    	for(int i=0;i<n-1;i++){
//    		//循环n-1次
//    		do{
//    			pos = (++pos)%n;
//    		}while(a[pos]==1);
//    		do{
//    			pos = (++pos)%n;
//    		}while(a[pos]==1);
//    		do{
//    			pos = (++pos)%n;
//    		}while(a[pos]==1);
//    		a[pos]=1;
//    	}
//    	do{
//			pos = (++pos)%n;
//		}while(a[pos]==1);
//    	lastIndex = pos;
//    	return lastIndex;
//    }
//    public static boolean IsPopOrder(int [] pushA,int [] popA) {
//      	Stack<Integer> s = new Stack<Integer>();
//      	int popIndex =0,pushIndex =0;
//        for(;popIndex<popA.length;popIndex++){
//            int popValue =0;
//            int pushValue = pushA[pushIndex];
//            if(s.empty()||s.peek()!=popValue){
//                do{
//                    if(pushIndex>=pushA.length){
//                    return false;
//                	}
//                	pushValue = pushA[pushIndex];
//                    
//                    s.push(pushValue);
//                    pushIndex++;
//                }while(pushValue!=popValue);
//            }
//            if(s.peek()==popValue){
//                s.pop();
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
//}
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    	if(n==0)return 0;
        if(n==1) return 1;
        return get1Count(String.valueOf(n));
    }
    //21345--> 1~1345  1346~21345
    private int get1Count(String s){
        int first = Integer.parseInt(s.charAt(0)+"");
        int len = s.length();
        if(len==1) return first==0?0:1;
        
        int oneInFirst = 0;
        if(first==1){
            oneInFirst = 1+Integer.parseInt(s.substring(1));
        }else{
            oneInFirst = powBy10(len-1);
        }
        int oneInOther = 0;
        oneInOther = first*(len-1)*powBy10(len-2);
        return get1Count(s.substring(1))+oneInFirst+oneInOther;
    }
    private int powBy10(int n){
        int result=1;
        for(int i=0;i<n;i++){
            result *=10;
        }
        return result;
    }
    public static void main(String[] args){
    	new Solution().NumberOf1Between1AndN_Solution(55);
    }
}