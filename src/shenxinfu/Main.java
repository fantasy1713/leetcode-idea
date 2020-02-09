package shenxinfu;

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if(a.equals(b)){
        	System.out.println(0);
        	return;
        }
        String[] apath = a.split("/");
    	String[] bpath = b.split("/");
        if(apath.length<bpath.length){
        	
        	for(int i=0;i<apath.length;i++){
        		if(!apath[i].equals(bpath[i])){
        			System.out.println(2);
        			return;
        		}
        	}
        	System.out.println(1);
        	return;
        }else{
        	for(int i=0;i<bpath.length;i++){
        		if(!bpath[i].equals(apath[i])){
        			System.out.println(2);
        			return;
        		}
        	}
        	System.out.println(-1);
        	return;
        }
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<String> qu = new PriorityQueue<String>();
        for(int i = 0;i<n;i++){
        	String temp = in.next();
        	qu.add(temp);
        }
        for(int i = 0;i<n;i++){
        	System.out.println(qu.poll());
        }
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line  =in.nextLine();
        
        try {
        	String a = line.split(" ")[0];
        	String b = line.split(" ")[1];
			BigDecimal aa = new BigDecimal(a);
			BigDecimal bb = new BigDecimal(b);
			
			System.out.println(aa.divide(bb));
		} catch (Exception e) {
			System.out.println("ERROR");
			return;
		}
    }
}*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextFloat()) {
            float x = in.nextFloat();
            if(x<0||x>100){
            	System.out.println("Error");
            }else if(x<=100&&x>=90){
            	System.out.println("A+");
            }else if(x<90&&x>=80){
            	System.out.println("A");
            }else if(x<80&&x>=70){
            	System.out.println("B+");
            }else if(x<70&&x>=60){
            	System.out.println("B");
            }else {
            	System.out.println("C");
            }
        }
    }
}

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if(n==0){
            	break;
            }
            if(n<=9){
            	System.out.println(n);
            	continue;
            }
            int count  =9;
            StringBuffer sb =new StringBuffer();
            for(int i=11;i<=n;i++){
            	sb.append(i);
            	if(sb.reverse().toString().equals(""+i)){
            		count++;
            	}
            	sb.setLength(0);
            }
            System.out.println(count);
        }
    }
}*/