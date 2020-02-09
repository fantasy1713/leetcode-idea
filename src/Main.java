//import java.util.Scanner;
//import java.math.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int p = 1,q=2;
//        while(true){
//        	int temp;
//        	while((temp =fun(p,q))<n){
//        		p++;
//        	}
//        	if(temp==n){
//        		//检查是否是素数
//        		boolean flag = check(p);
//        		if(flag){
//        			System.out.println(p+" "+q );
//        			return;
//        		}
//        		p=1;
//        		q++;
//        	}else{
//        		if(p==2){
//        			break;
//        		}
//        		p=1;q++;
//        	}
//        	
//        }
//       System.out.println("No");
//        }
//    public static int fun(int p ,int q){
//    	return (int) Math.pow(p, q);
//    }
//    public static boolean check(int p){
//    	boolean flag = true;
//    	for(int i=2;i<p/2;i++){
//    		if((p%i)==0)
//    			flag=false;
//    	}
//    	return flag;
//    }
//    
//    
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N= in.nextInt();
//        int L = in.nextInt();
//        for(int i = L;i<=100&&i<=N;i++){
//        	int sum = sum(i);
//        	int temp = N-sum;
//        	if (temp<0) break;
//        	if(temp%i==0){
//        		print(temp/i,i);
//        	return;
//        	}
//        } 
//        System.out.println("No");
//    }
//    public static int sum(int L){
//    	int sum = 0;
//    	for(int i=0;i<L;i++){
//    		sum+=i;
//    	}
//    	return sum;
//    }
//    public static void print(int start,int len){
//    	StringBuffer sb = new StringBuffer();
//    	for(int i=0;i<len;i++){
//    		sb.append(start+i).append(" ");
//    	}
//    	sb.setLength(sb.length()-1);
//    	System.out.print(sb.toString());
//    }
//}

//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		while(in.hasNext()){
//			int n = in.nextInt();
//			int[] w = new int [n+1];
//			int[] v = new int[n+1];
//			for(int i = 1;i<=n;i++){
//				v[i] = in.nextInt();
//			}
//			for(int i = 1;i<=n;i++){
//				w[i] = in.nextInt();
//			}
//			int b = in.nextInt();//背包大小
//			//
//			int[][] max = new int[n+1][b+1];
//			for(int i=1;i<=n;i++){
//				int thisWeight = w[i];
//				int thisValue = v[i];
//				for(int j = 1;j<=b;j++){
//					if(j<thisWeight){
//						max[i][j] = max[i-1][j];
//					}else{
//						max[i][j] = max[i-1][j];
//						int temp = max[i-1][j-thisWeight]+thisValue;
//						if(temp>max[i][j]){
//							max[i][j] =temp;
//						}
//					}
//				}
//			}
//			System.out.println(max[n][b]);
//		}
//
//	}
//
//}
import java.util.HashSet;
//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		while(in.hasNext()){
//			HashSet<Integer> set = new HashSet<Integer>();
//			int m = in.nextInt();
//			int[] a = new int[m];
//			for(int i=0;i<m;i++){
//				a[i] = in.nextInt();
//				set.add(a[i]);
//			}
//			int n = in.nextInt();
//			int[] b = new int[n];
//			StringBuffer sb = new StringBuffer();
//			for(int i=0;i<n;i++){
//				b[i] = in.nextInt();
//				if(set.contains(b[i])){
//					sb.append(b[i]+" ");
//				}
//			}
//			if(sb.length()>1){
//				sb.setLength(sb.length()-1);
//			}
//			System.out.print(sb.toString());
//		}
//
//	}
//	
//}
//import java.util.HashSet;
//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		HashSet<Long> set = new HashSet<Long>();
//		
//		while(in.hasNext()){
//			long uid = in.nextLong();
//			if(uid==0)break;
//			if(set.contains(uid))continue;
//			set.add(uid);
//		}
//		System.out.println(set.size());
//
//	}
//	
//}

//import java.util.HashSet;
//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String exp = in.nextLine();
//		String result = cal(exp);
//		exp = exp+" = "+result;
//		char[] a = exp.toCharArray();
//		StringBuffer sb1 = new StringBuffer();
//		StringBuffer sb2 = new StringBuffer();
//		StringBuffer sb3 = new StringBuffer();
//		StringBuffer sb4 = new StringBuffer();
//		StringBuffer sb5 = new StringBuffer();
//		for(int i = 0;i<a.length;i++){
//			char c = a[i];
//			switch(c){
//			case '1':
//				sb1.append("*  ");
//				sb2.append("*  ");
//				sb3.append("*  ");
//				sb4.append("*  ");
//				sb5.append("*  ");
//				break;
//			case '2':
//				sb1.append("*** ");
//				sb2.append("  * ");
//				sb3.append("*** ");
//				sb4.append("*   ");
//				sb5.append("*** ");
//				break;
//			case '3':
//				sb1.append("*** ");
//				sb2.append("  * ");
//				sb3.append("*** ");
//				sb4.append("  * ");
//				sb5.append("*** ");
//				break;
//			case '4':
//				sb1.append("* * ");
//				sb2.append("* * ");
//				sb3.append("*** ");
//				sb4.append("  * ");
//				sb5.append("  * ");
//				break;
//			case '5':
//				sb1.append("*** ");
//				sb2.append("*   ");
//				sb3.append("*** ");
//				sb4.append("  * ");
//				sb5.append("*** ");
//				break;
//			case '6':
//				sb1.append("*** ");
//				sb2.append("*   ");
//				sb3.append("*** ");
//				sb4.append("* * ");
//				sb5.append("*** ");
//				break;
//			case '7':
//				sb1.append("*** ");
//				sb2.append("  * ");
//				sb3.append("  * ");
//				sb4.append("  * ");
//				sb5.append("  * ");
//				break;
//			case '8':
//				sb1.append("*** ");
//				sb2.append("* * ");
//				sb3.append("*** ");
//				sb4.append("* * ");
//				sb5.append("*** ");
//				break;
//			case '9':
//				sb1.append("*** ");
//				sb2.append("* * ");
//				sb3.append("*** ");
//				sb4.append("  * ");
//				sb5.append("*** ");
//				break;
//			case '0':
//				sb1.append("*** ");
//				sb2.append("* * ");
//				sb3.append("* * ");
//				sb4.append("* * ");
//				sb5.append("*** ");
//				break;
//			case ' ':
//				sb1.append(" ");
//				sb2.append(" ");
//				sb3.append(" ");
//				sb4.append(" ");
//				sb5.append(" ");
//				break;
//			case '+':
//				sb1.append("    ");
//				sb2.append(" *  ");
//				sb3.append("*** ");
//				sb4.append(" *  ");
//				sb5.append("    ");
//				break;
//			case '-':
//				sb1.append("    ");
//				sb2.append("    ");
//				sb3.append("*** ");
//				sb4.append("    ");
//				sb5.append("    ");
//				break;
//			case '*':
//				sb1.append("    ");
//				sb2.append("* * ");
//				sb3.append(" *  ");
//				sb4.append("* * ");
//				sb5.append("    ");
//				break;
//			case '/':
//				sb1.append("    ");
//				sb2.append("  * ");
//				sb3.append(" *  ");
//				sb4.append("*   ");
//				sb5.append("    ");
//				break;
//			case '=':
//				sb1.append("     ");
//				sb2.append("**** ");
//				sb3.append("     ");
//				sb4.append("**** ");
//				sb5.append("     ");
//				break;
//			case '.':
//				sb1.append("   ");
//				sb2.append("   ");
//				sb3.append("   ");
//				sb4.append("** ");
//				sb5.append("** ");
//				break;
//			}
//		}
//		
//		//System.out.println(result);
//		System.out.println(sb1.toString());
//		System.out.println(sb2.toString());
//		System.out.println(sb3.toString());
//		System.out.println(sb4.toString());
//		System.out.println(sb5.toString());
//
//	}
//	
//	private static String cal(String s){
//		StringBuffer sb = new StringBuffer();
//		double a =0,b = 0;
//		char[] c = s.toCharArray();
//		int pos =0;
//		boolean done = false;
//		while(!done){
//			if(c[pos]>='0'&&c[pos]<='9'){
//				done = true;
//				while(c[pos]>='0'&&c[pos]<='9'){
//					a= a*10+(c[pos++]-'0');
//				}
//				break;
//			}
//			pos++;
//		}
//		char op ='+';
//		
//		done = false;
//		while(!done){
//			if(c[pos]=='+'||c[pos]=='-'||c[pos]=='*'||c[pos]=='/'){
//				op = c[pos];
//			}
//			if(c[pos]>='0'&&c[pos]<='9'){
//				done = true;
//				while(pos<c.length&&c[pos]>='0'&&c[pos]<='9'){
//					b= b*10+(c[pos++]-'0');
//				}
//				break;
//			}
//			pos++;
//		}
//		double result =0d;
//		switch(op){
//		case '+':result = a+b;break;
//		case '-':result = a-b;break;
//		case '*':result = a*b;break;
//		case '/':result = a/b;break;
//		}
//		
//		if(op!='/'){
//			return String.valueOf((int)result);
//		}else{
//			String temp = String.valueOf(result);
//			int p = temp.lastIndexOf('.');
//			if((p+2)<temp.length()){
//				double rou = (int) Math.round(result*100);
//				return String.valueOf(rou/100);
//			}
//			return temp;
//		}
//	}
//	
//}



import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.GetNumberOfK(new int[]{1,2,3,3,3,3,4,5}, 3);
		
		
		

	}
	
	public int GetNumberOfK(int [] array , int k) {
	       if(array==null||array.length==0||k<array[0]||k>array[array.length-1])return 0;
	        int first = getFirst(array,k,0,array.length-1);
	        int last = getLast(array,k,0,array.length-1);
	        if(first!=-1||last==-1){return 0;}
	        return last-first+1;
	    }
	    private int getFirst(int[] data,int k,int low,int high){
	        if(low>high)return -1;
	        int mid  =(low+high)>>1;
	        if(k==data[mid]){
	            if(mid==0||data[mid-1]<k){
	                return mid;
	            }
	            return getFirst(data,k,low,mid-1);
	            
	        }else if(k<data[mid]){
	            return getFirst(data,k,low,mid-1);
	        }else{
	            return getFirst(data,k,mid+1,high);
	        }
	    }
	    private int getLast(int[] data,int k,int low,int high){
	        if(low>high)return -1;
	        int mid  =(low+high)>>1;
	        if(k==data[mid]){
	            if(mid==data.length-1||data[mid+1]>k){
	                return mid;
	            }
	            return getLast(data,k,mid+1,high);
	            
	        }else if(k<data[mid]){
	            return getLast(data,k,low,mid-1);
	        }else{
	            return getLast(data,k,mid+1,high);
	        }
	    }
	
}