package wangyihangzhou;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int f = in.nextInt();
		int d = in.nextInt();
		int p = in.nextInt();
		System.out.println((int)((d+p*f)/(x+p)));
		
	}
}
//import java.lang.reflect.Array;
//import java.util.Arrays;
////
////
////import java.util.Scanner;
////
////
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        while (in.hasNextInt()) {//注意while处理多个case
////            int n =in.nextInt();
////            int[] tx = new int[n];
////            int[] ty = new int[n];
////            int gx,gy;
////            int walkT,taxiT;
////            for(int i=0;i<n;i++){
////            	tx[i] = in.nextInt();
////            }
////            for(int i=0;i<n;i++){
////            	ty[i] = in.nextInt();
////            }
////            gx = in.nextInt();gy = in.nextInt();
////            walkT = in.nextInt();taxiT = in.nextInt();
////            //输入结束
////
////            int minT =walkT*(Math.abs(gx)+Math.abs(gy)); //走路到公司
////            for(int i=0;i<n;i++){
////            	int toTaxiT = walkT*(Math.abs(tx[i])+Math.abs(ty[i]));//走到i个打车点
////            	int taxtToGT = taxiT*(Math.abs(gx-tx[i])+Math.abs(gy-ty[i]));
////            	int temp = toTaxiT+taxtToGT;
////            	if(temp<minT){
////            		minT = temp;
////            	}
////            }
////            System.out.println(minT);
////            
////        }
////    }
////}
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        while (in.hasNext()) {//注意while处理多个case
////            String str = in.next();
////            int len = str.length();
////            char[] c = str.toCharArray();
////            int count=0;
////            for(int i = 0;i<len-1;i++){
////    			for(int j =0;j<len-1-i;j++){
////    				if(c[j]>c[j+1]){
////    					char temp  = c[j];
////    					c[j] = c[j+1];
////    					c[j+1] = temp;
////    					count++;
////    				}
////    			}
////    		}
////            int min = count;
////            c = str.toCharArray();
////             count=0;
////            for(int i = 0;i<len-1;i++){
////    			for(int j =0;j<len-1-i;j++){
////    				if(c[j]<c[j+1]){
////    					char temp  = c[j];
////    					c[j] = c[j+1];
////    					c[j+1] = temp;
////    					count++;
////    				}
////    			}
////    		}
////            min = count<min?count:min;
////           System.out.println(min);
////        }
////    }
////}
////import java.util.Scanner;
////
////public class Main {
////	public static void main(String[] args) {
////		Scanner in = new Scanner(System.in);
////		while (in.hasNextInt()) {// 注意while处理多个case
////			int n = in.nextInt();
////			int k = in.nextInt();
////			int[] a = new int[n];
////			int[] compare = new int[n];
////			for (int i = 0; i < n; i++) {
////				a[i] = in.nextInt();
////				
////			}
////			for (int i = 0; i < n; i++) {
////				a[i] = in.nextInt();
////				
////			}
////			// 输入结束
////			for (int j = 0; j < k; j++) {
////				int [] temp = new int[n];
////				System.arraycopy(a, 0, temp, 0, n);
////				for (int i = 0; i < n; i++) {
////					a[i] = (temp[i]+temp[(i+1)%n])%100;
////				}
////				if(equ(a,compare)){
////					k = k%j;j = 0;
////				}
////			}
////			//输出
////			for (int i = 0; i < n; i++) {
////				if(i!=0){
////					System.out.print(" ");
////				}
////				System.out.print(a[i]);
////				
////			}
////		}
////		
////	}
////	private static boolean equ(int[] a,int [] b){
////		for(int i=0;i<a.length;i++){
////			if(a[i]!=b[i]){
////				return false;
////			}
////		}
////		return true;
////	}
////}
//import java.util.*;
//public class Main{
//  
//  public static void main(String[] args){
//  	Scanner s = new Scanner(System.in);
//    while(s.hasNextInt()){
//      int n = s.nextInt();
//      int count = 0;
//      for(int i=1;i<=n/2;i++){
//        if(isP(n-i)){
//        	count++;
//        }
//      }
//      System.out.println(count);
//    }
//  }
//  private static boolean isP(int a){
//    for(int i=2;i<=a/2;i++){
//      if(a%i==0){
//        return false;
//                }
//    }
//    return true;
//  }
//}