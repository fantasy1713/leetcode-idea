package didi;

import java.math.BigDecimal;

//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {//注意while处理多个case
//            int m = in.nextInt();
//            int n = in.nextInt();
//            int tagValue  =1;
//            boolean[][] map = new boolean[m][n];
//            int k = in.nextInt();
//            StringBuffer result = new StringBuffer();
//            int count = 0;
//            Map<String,Integer> landMap = new HashMap<String,Integer>();
//            for(int i=0;i<k;i++){
//            	int row = in.nextInt();
//            	int col = in.nextInt();
//
//            	String key = row+":"+col;
//            	if(row<0||row>=m||col<0||col>=n||map[row][col]){
//            		result.append(count+" ");
//            		continue;
//            	}
//            	map[row][col] =true;
//            	boolean w = false,d = false,s =false,a =false;
//            	w = (row-1)<0?false:map[row-1][col];
//            	d = (col+1)>=n?false:map[row][col+1];
//            	s = (row+1)>=m?false:map[row+1][col];
//            	a = (col-1)<0?false:map[row][col-1];
//            	Set<Integer> set = new HashSet<Integer>();
//            	if(w){
//            		set.add(landMap.get((row-1)+":"+col));
//            	}
//            	if(s){
//            		set.add(landMap.get((row+1)+":"+col));
//            	}
//            	if(a){
//            		set.add(landMap.get(row+":"+(col-1)));
//            	}
//            	if(d){
//            		set.add(landMap.get(row+":"+(col+1)));
//            	}
//            	if(set.size()==0){
//            		count++;
//            	}else{
//            		int size = set.size();
//            	
//            		for(Map.Entry<String,Integer> en:landMap.entrySet()){
//            			int tag = en.getValue();
//            			if(set.contains(tag)){
//            				landMap.put(en.getKey(), tagValue);
//            			}
//            		}
//            		
//            		count = count-size+1;
//            	}
//            	landMap.put(key,tagValue++);
//            	result.append(count+" ");
//            }
//            if(result.length()>0){
//            	result.setLength(result.length()-1);
//            }
//            System.out.println(result.toString());
//        }
//    }
//}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            double a = in.nextDouble();
            
            String str = String.valueOf(a);
            int n = in.nextInt();
            
            BigDecimal bd = new BigDecimal(str);
            bd = bd.pow(n);
            System.out.println(bd.toPlainString());
        }
    }
}