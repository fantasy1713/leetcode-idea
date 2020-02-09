package ali;

import javax.swing.plaf.SliderUI;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
		while (scanner.hasNextLine()) {
			String[] options = scanner.nextLine().split(";");
			if (options.length < 5) {
				break;
			}
			lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
		}
		scanner.close();

		// wirte your code here
		List<String> result = calculateUnilateral(lineList);

		for (String str : result) {
			System.out.println(str);
		}
	}

	public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
		List<String> result = new ArrayList<String>();
		String[] cens = getAllCen(lineList);
		int len = cens.length;
		Stack<String>[][] map_small = new Stack[len][len];
		Stack<String>[][] map_big = new Stack[len][len];
		Map<String, Integer> indexMap = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			indexMap.put(cens[i], i);
		}
		for (UnilateralLine l : lineList) {
			String sc = l.getSCen();
			String ec = l.getECen();
			int si = indexMap.get(sc);
			int ei = indexMap.get(ec);
			if ("9.6m".equals(l.getTType())) {
				if (map_small[si][ei] == null) {
					map_small[si][ei] = new Stack<String>();
				}
				map_small[si][ei].add(l.getId());
			} else {
				if (map_big[si][ei] == null) {
					map_big[si][ei] = new Stack<String>();
				}
				map_big[si][ei].add(l.getId());

			}

		}

		return result;
	}

	private static void rule1(Stack<String>[][] map_small, Stack<String>[][] map_big, String[] cens,
			List<String> result, int len) {
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				// 下三角
				int scount = map_small[i][j].size();

				if (scount > 0) {
					if (map_small[j][i].size() > 0) {
						int min = scount < map_small[j][i].size() ? scount : map_small[j][i].size();
						for(int k =0;k<min;k++){
							StringBuffer sb = new StringBuffer("rule1： ");
							sb.append(map_small[i][j].pop());
							sb.append("+");
							sb.append(map_small[j][i].pop());
							result.add(sb.toString());
						}

					}else if(map_small[j][i].size() > 0&&scount>=2){
						
					}
				}
			}
		}
	}

	public static String[] getAllCen(List<UnilateralLine> lineList) {
		Set<String> set = new HashSet<String>();
		for (UnilateralLine l : lineList) {
			set.add(l.getSCen());
			set.add(l.getECen());
		}
		return set.toArray(new String[0]);
	}

	public static class UnilateralLine {
		private String id;
		private String sCen;// 出发分拨
		private String sPro;// 出发省
		private String eCen;// 到达分拨
		private String ePro;// 到达省
		// 9.6m/17.5m
		private String tType;// 车型

		public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
			this.id = id;
			this.sCen = sCen;
			this.sPro = sPro;
			this.eCen = eCen;
			this.ePro = ePro;
			this.tType = tType;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSCen() {
			return sCen;
		}

		public void setSCen(String ePro) {
			this.ePro = ePro;
		}

		public String getSPro() {
			return sPro;
		}

		public void setSPro(String sPro) {
			this.sPro = sPro;
		}

		public String getECen() {
			return eCen;
		}

		public void setECen(String eCen) {
			this.eCen = eCen;
		}

		public String getEPro() {
			return ePro;
		}

		public void setEPro(String ePro) {
			this.ePro = ePro;
		}

		public String getTType() {
			return tType;
		}

		public void setTType(String tType) {
			this.tType = tType;
		}
	}
}

// public class Main {
/// ** 请完成下面这个函数，实现题目要求的功能 **/
/// ** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
// static int pick(int[] peaches) {
// int maxGet=0;
// int len = peaches.length;
// int [] f = new int[len];
// for(int i=0;i<len;i++){
// int max = 0;
// int j = i-1;
// while(j>=0){
// if(peaches[i]>peaches[j]&&f[j]>max){
// max = f[j];
// }
// j--;
// }
// if(max==0){
// f[i] = 1;
// }else{
// f[i] = max+1;
// }
// }
// for(int i=0;i<len;i++){
// if(f[i]>maxGet){
// maxGet = f[i];
// }
// }
// return maxGet;
// }
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// int trees = Integer.parseInt(in.nextLine().trim());
// int[] peaches = new int[trees];
// for (int i = 0; i < peaches.length; i++) {
// peaches[i] = Integer.parseInt(in.nextLine().trim());
// }
// System.out.println(pick(peaches));
// }
// }
// public class Main {
// public static void main(String[] args){
//
// MyThread mt = new MyThread();
// Thread t1 = new Thread(mt);
// Thread t2 = new Thread(mt);
// Thread t3 = new Thread(mt);
//
// t1.start();
// t2.start();
// t3.start();
//
// }
// }
//
// class MyThread implements Runnable {
// Integer count =0;
// long start ;
//
// public void run() {
//
// synchronized (count) {
// if(count==0){
// start =System.currentTimeMillis();
// }
// while(count<10000){
// count++;
// if(count==10000){
// long end = System.currentTimeMillis();
// System.out.println(end-start);
// break;
// }
// try {
// Thread.sleep(100);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//
// }
//
//
//
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
//
// String s = in.nextLine();
// String p = in.nextLine();
//
// System.out.println(isMatch(s, p));
//
// }
// public static int isMatch(String s,String p){
// return im(s,p)?1:0;
// }
// private static boolean im(String s,String p){
// if(p.length()==0)return s.length()==0;
// char pChar = p.charAt(0);
//
// if(pChar!='*'){
// char sChar = '\0';
// if(s.length()>0)sChar = s.charAt(0);
// if(sChar!='\0'&&(sChar==pChar||pChar=='?')){
// return im(s.substring(1),p.substring(1));
// }
// return false;
// }else{
// char sChar = '\0';
// if(s.length()>0)sChar = s.charAt(0);
// if(!im(s,p.substring(1))){
// if(sChar!='\0'){
// return im(s.substring(1),p);
// }
// else{
// return false;
// }
// }
// return true;
// }
// }
// }

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// import java.util.Stack;
//
// public class Main {
//
// public static void main(String[] args) {
//
// ArrayList<Integer> inputs = new ArrayList<Integer>();
// Scanner in = new Scanner(System.in);
// String line = in.nextLine();
// if(line != null && !line.isEmpty()) {
// int res = resolve(line.trim());
// System.out.println(String.valueOf(res));
// }
// }
//
// // write your code here
// public static int resolve(String expr) {
// Stack<Integer> stack = new Stack<Integer>();
// for(int i=0;i<expr.length();i++){
// char cur = expr.charAt(i);
// if(isDigt(cur)){
// StringBuffer temp = new StringBuffer();
// char num = cur;
// while(isDigt(num)){
// temp.append(num);
// num = expr.charAt(++i);
//
// }
// if(stack.size()<16){
// stack.push(Integer.valueOf(temp.toString()));
// }else{
// return -2;
// }
// }
// else if(cur== ' '){
//
// }else if(cur=='+'){
// if(stack.size()<2){
// return -1;
// }
// int a = stack.pop();
// int b = stack.pop();
// stack.add(a+b);
// }
// else if(cur=='*'){
// if(stack.size()<2){
// return -1;
// }
// int a = stack.pop();
// int b = stack.pop();
// stack.add(a*b);
// }else if(cur=='^'){
// if(stack.size()<1){
// return -1;
// }
// int a = stack.pop();
// a++;
// stack.add(a);
// }
// }
// if(!stack.isEmpty())
// return stack.peek();
// return -1;
//
// }
// private static boolean isDigt(char c){
// if(c>='0'&&c<='9')return true;
// return false;
// }
// }