package niukewang;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

//public class Main {
//	public static void main(String[] args){
//    	Scanner s = new Scanner(System.in);
//    	while(s.hasNextInt()){
//            int n =s.nextInt();
//        	n = n>1000?999:n;
//        	System.out.println(last(n));
//        }
//        
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
//}
//public class Main {
//	public static void main(String[] args){
//    	Scanner s = new Scanner(System.in);
//    	while(s.hasNext()){
//            String str =s.next();
//        	
//        	System.out.println(charSet(str));
//        }
//        
//    }
//    public static String charSet(String s){
//    	StringBuffer sb = new StringBuffer();
//    	Map<Character,Integer> map = new HashMap<Character,Integer>();
//    	ArrayList<Integer> list = new ArrayList<Integer>();
//    	for(int i=0;i<s.length();i++){
//    		char c = s.charAt(i);
//    		if(map.get(c)==null){
//    			map.put(c,i);
//    			list.add(i);
//    		}
//    	}
//    	for(int i = 0;i<list.size();i++){
//    		sb.append(s.charAt(list.get(i)));
//    	}
//    	
//    	return sb.toString();
//    }
//}
//public class Main {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		while (s.hasNext()) {
//			int N = s.nextInt();
//			int M = s.nextInt();
//			int[] a = new int[N];
//			for (int i = 0; i < N; i++) {
//				a[i] = s.nextInt();
//			}
//			for (int i = 0; i < M; i++) {
//				char c = s.next().charAt(0);
//				if (c == 'U') {
//					int index = s.nextInt();
//					int newValue = s.nextInt();
//					a[index - 1] = newValue;
//				} else if (c == 'Q') {
//					int from = s.nextInt();
//					int to = s.nextInt();
//					System.out.println(findMax(a, from - 1, to - 1));
//				}
//			}
//
//		}
//
//	}
//
//	private static int findMax(int[] a, int start, int end) {
//		int max = -1;
//		if (start <= end)
//			for (int i = start; i <= end; i++) {
//				if (a[i] > max) {
//					max = a[i];
//				}
//			}
//		else
//			for (int i = end; i <= start; i++) {
//				if (a[i] > max) {
//					max = a[i];
//				}
//			}
//		return max;
//	}
//
//}
//public class Main {
//	public static void main(String[] args){
//    	Scanner s = new Scanner(System.in);
//    	Map<String ,Integer> map = new HashMap<String,Integer>();
//    	List<String> list = new ArrayList<String>();
//    	while(s.hasNext()){
//            String file =s.next();
//            String filename = file.substring(file.lastIndexOf('\\')+1);
//            String line = s.next();
//            Integer count=0;
//            String mixName = filename+":"+line;
//            if((count =map.get(mixName))!=null){
//            	map.put(mixName, count+1);
//            }else{
//            	list.add(mixName);
//            	map.put(mixName, 1);
//            }
//        	
//        }
//    	int size =8;
//    	if(list.size()<8){
//    		size = list.size();
//    	}
//    	for(int i=0;i<size;i++){
//    		String maxName = null;
//    		int maxCount = -1;
//    		for(String str:list){
//    			if(map.get(str)>maxCount){
//    				maxName = str;
//    				maxCount = map.get(str);
//    			}
//    		}
//    		list.remove(list.indexOf(maxName));
//    		int count = map.get(maxName);
//    		String[] nameAndLine = maxName.split(":");
//    		if(nameAndLine[0].length()>16){
//    			String shortName = nameAndLine[0].substring(nameAndLine[0].length()-16);
//    			nameAndLine[0] = shortName;
//    		}
//    		System.out.println(nameAndLine[0]+" "+nameAndLine[1]+" "+count);
//    	}
//    	
//        
//    }
//   
//}
//public class Main {
//	public static void main(String[] args){
//    	Scanner s = new Scanner(System.in);
//    	
//    	while(s.hasNext()){
//            int n = s.nextInt();
//            int [] a = new int[n];
//            for(int i = 0;i<n;i++){
//            	a[i] = s.nextInt();
//            }
//        	int[] result = maxmin(a,0,n-1);
//        	System.out.println(result[0]+" "+result[1]);
//        }
//    	
//    	
//        
//    }
//	private static int[] maxmin(int[] a,int low,int high){
//		int [] result = new int[2];
//		if(low==high){
//			result[0] = a[high];
//			result[1] = a[low];
//			return result;
//		}
//		if(low+1==high){
//			if(a[low]>a[high]){
//				result[0] = a[high];
//				result[1] = a[low];
//			}else{
//				result[0] = a[low];
//				result[1] = a[high];
//			}
//			return result;
//		}
//		int mid = (low+high)/2;
//		int [] pre = maxmin(a,low,mid);
//		int [] post = maxmin(a, mid+1, high);
//		
//		result[0] = pre[0]<post[0]?pre[0]:post[0];
//		result[1] = pre[1]>post[1]?pre[1]:post[1];
//		
//		
//		return result ;
//	}
//   
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String a = in.next();
//            StringBuffer sb = new StringBuffer();
//            for(int i=0;i<a.length();i++){
//            	char c = a.charAt(i);
//            	if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
//            		sb.append(c);
//            	}
//            }
//            String b = sb.toString().toLowerCase();
//            System.out.println(b);
//        }
//    }
//}

//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		while (in.hasNext()) {
//			int result =0;
//			String str = in.next();
//			Stack<Integer> s = new Stack<Integer>();
//			for(int i = 0;i<str.length();i++){
//				char c = str.charAt(i);
//				if(c>='0'&&c<='9'){
//					s.push(c-'0');
//				}else if(c>='A'&&c<='F'){
//					s.push(10+(c-'A'));
//				}else if(c=='+'){
//					int a = s.pop();
//					int b = s.pop();
//					s.push(a+b);
//				}else if(c=='-'){
//					int a = s.pop();
//					int b = s.pop();
//					s.push(b-a);
//				}
//				else if(c=='*'){
//					int a = s.pop();
//					int b = s.pop();
//					s.push(a*b);
//				}
//				
//			}
//			result = s.pop();
//			System.out.println(result);
//		}
//	}
//}
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		while (in.hasNext()) {
//			int offset  = in.nextInt();
//			int n = in.nextInt();
//			int l1 = in.nextInt();
//			int l2 = in.nextInt();
//			int s1 =0,e1 = 0,s2 = 0,e2 = 0;
//			if(offset<l1){
//				s1 = offset;
//				if(offset+n<l1){
//					e1 = offset+n;
//					s2 = 0;e2 = 0;
//				}else if(offset+n>=l1&&(offset+n)<(l1+l2)){
//					e1 = l1;
//					s2 = 0;e2 = offset+n-l1;
//				}else{
//					e1 = l1;
//					s2 = 0;e2 = l2;
//				}
//			}else if(offset>=l1&&offset<(l1+l2)){
//				s1 = l1;e1 = l1;
//				if(offset+n<(l1+l2)){
//					s2 = offset-l1;
//					e2 = offset+n-l1;
//				}else{
//					s2 = offset-l1;
//					e2 = l2;
//				}
//			}else{
//				s1 = l1;e1 = l1;s2  =l2;e2  =l2;
//			}
//			
//			System.out.println(s1+" "+e1+" "+s2+" "+e2);
//			
//		}
//	}
//}
//public class Main {
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//
//	while (in.hasNext()) {
//		String str = in.next();
//		String[] s = str.split(",");
//		if(s.length<=1){
//			System.out.println("1");
//			continue;
//		}
//		int len = s.length;
//		boolean [][] a = new boolean[len][len];
//		loop:for(int i = 0;i<len;i++){
//			a[i][i] = true;
//			for(int j = 0;j<i;j++){
//				a[i][j] = s[i].equals(s[j])&&((i-j)<2||a[i-1][j+1]);
//				if(i+j == len-1){
//					if(!a[i][j] ){
//						break loop;
//					}
//				}
//			}
//		}
//		if(a[len-1][0]){
//			System.out.println("1");
//		}else{
//			System.out.println("0");
//		}
//		
//	}
//}
//}

//public class Main {
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//
//	while (in.hasNext()) {
//		String str = in.next();
//		String[] s = str.split(",");
//		if(s.length<=1){
//			System.out.println("1");
//			continue;
//		}
//		int len = s.length;
//		if(len%2==0){
//			int pos1 = len/2-1;
//			int pos2 = len/2;
//			while(pos1>=0&&pos2<len&&s[pos1].equals(s[pos2])){
//				pos1--;
//				pos2++;
//			}
//			if(pos1==-1&&pos2==len){
//				System.out.println("1");
//			}else{
//				System.out.println("0");
//			}
//		}
//		else{
//			int pos1 = len/2-1;
//			int pos2 = len/2+1;
//			while(pos1>=0&&pos2<len&&s[pos1].equals(s[pos2])){
//				pos1--;
//				pos2++;
//			}
//			if(pos1==-1&&pos2==len){
//				System.out.println("1");
//			}else{
//				System.out.println("0");
//			}
//		}
//		
//	}
//}
//}
//public class Main {
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//
//	while (in.hasNext()) {
//		String str = in.next();
//		String[] s = str.split(",");
//		int[] ss = new int[s.length];
//		for(int i = 0;i<s.length;i++){
//			ss[i] = Integer.valueOf(s[i]);
//		}
//		if(s.length<=1){
//			System.out.println("1");
//			continue;
//		}
//		int len = s.length;
//		boolean flag = check(ss,(len-1)/2,(len-1)/2);
//		if(flag){
//			System.out.println("1");
//		}else{
//			System.out.println("0");
//		}
//	}
//}
//private static boolean check(int[] s,int pos,int last){
//	boolean flag = true;
//		for(int i = last-1;i>=pos;i--){
//			flag= s[i]==s[s.length-1-i];
//			if(!flag)break;
//		}
//		 
//		if(!flag)return false;
//		if(pos==1||pos==0)return s[0]==(s[s.length-1]);
//		return check(s,pos/2,pos);
//	
//	
//	
//}
//}
//public class Main {
//public static void main(String[] args) {
//	Comparator<Integer> com = new Comparator<Integer>(){
//
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			
//			return o2-o1;
//		}
//		
//	};
//	Queue<Integer> q = new PriorityQueue<Integer>(10,com);
//	
//	q.add(2);
//	q.add(3);
//	q.add(1);
//	q.offer(4);
//	System.out.println(q.poll()+""+q.poll()+q.poll()+q.poll());
//	
//}
//private static int findMin(List<Integer> list){
//	if(list.size()==0)return -1;
//	int min =0;
//	for(int i = 1;i<list.size();i++){
//		if(list.get(i)<list.get(min)){
//			min = i;
//		}
//	}
//	return min;
//}
//
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {//注意while处理多个case
//            int a = in.nextInt();
//            if(a<10){
//            	System.out.println("NO");
//            	
//            	continue;
//            }
//            if(check(a)){
//            	System.out.println("YES");
//            }else{
//            	System.out.println("NO");
//            }
//        }
//    }
//    private static boolean check(int a){
//    	char[] c = String.valueOf(a).toCharArray();
//    	if(c.length<2){
//    		return false;
//    	}
//
//    	int cut =0;
//    	for(;cut<c.length-1;cut++){
//    		int left =1,right = 1;
//    		for(int i = 0;i<=cut;i++){
//    			left*=c[i]-'0';
//    		}
//    		for(int i = cut+1;i<c.length;i++){
//    			right*=c[i]-'0';
//    		}
//    		if(left==right){
//    			return true;
//    		}
//    	}
//    	return false;
//    }
//    
//}
//public class Main {
//	public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        HashMap<String ,Integer> map = new HashMap<String,Integer>();
//        String[] str = new String[n];
//        for(int i = 0; i < n; i++){
//            str[i] = s.next();
//            str[i] = sortString(str[i]);
//            
//            	map.put(str[i], 1);
//           
//        } 
//        System.out.println(map.size());
//        
//       
//	}
//	private static String sortString(String str){
//		
//		char[] arr = str.toCharArray();
//		int len = arr.length;
//		for(int i =0;i<len-1;i++){
//			for(int j = 0;j<len-1-i;j++){
//				if(arr[j]>arr[j+1]){
//					char temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		return new String(arr);
//	}
//}
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int maxQps= Integer.valueOf(in.nextLine());
		final String[] rtList = in.nextLine().split(",");
		final int requestNum = Integer.valueOf(in.nextLine());
		final int threadNum = Integer.valueOf(in.nextLine());
		System.out.println(doneTime(maxQps, rtList, requestNum, threadNum));
	}
	/**
	 * 如果使用最优的最大吞吐量负载均衡算法，按照最优模型多久能够处理完所有请求，单位毫秒。
	 * @return
	 */
	static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {

		
		int [] rtArr = new int[rtList.length];
		for(int i=0;i<rtList.length;i++){
			
			rtArr[i] = Integer.valueOf(rtList[i]);//rt (ms)
		}
		int[] consume = new int[rtList.length];
		for(int i=0;i<rtList.length;i++){
			consume[i] = 1000/rtArr[i]>maxQps?maxQps:1000/rtArr[i];
			
		}
		int consumeSum = 0;
		for(int i=0;i<rtList.length;i++){
			consumeSum+=consume[i];
			
		}
		
		
		return requestNum*1000/consumeSum;
	}
}







