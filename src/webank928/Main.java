package webank928;




/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(b-c+1);
    }  
}*/
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = n/2+1;
        System.out.println(1+n%s);
    }  
}*/
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        char[] b = Long.toBinaryString(N).toCharArray();
        int count =0;
        for(long i= N;i>=0;i--){
        	if((i&1)==1||i==0){
        		char[] temp = Long.toBinaryString(i).toCharArray();
        		if(isP(temp)){
        			count++;
        		}
        	}
        }
        System.out.println(count);
    }  
    private static boolean isP(char[] c){
    	if(c.length<=1)return true;
    	for(int i = 0;i<c.length/2;i++){
    		int j = c.length-1-i;
    		if(c[i]!=c[j])
    			return false;
    	}
    	return true;
    }
}*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        if (N%2==0){
        	N--;
        }
        
        int count =3;// 0/1/3
        if(N==3){
        	System.out.println(3);
        	return;
        }else if(N==1){
        	System.out.println(2);
        	return;
        }else
        while(N>3){
        	char[] c = Long.toBinaryString(N).toCharArray();
            while(!isP(c)){
            	N -=2;
            	if(N<=3){
            		break;
            	}
            	c = Long.toBinaryString(N).toCharArray();
            }
        	//c = Long.toBinaryString(N).toCharArray();
        	int len = c.length;
        	String s ;
        	if(len%2==0){
        		s = String.copyValueOf(c, 1, len/2-1);
        	}else{
        		s = String.copyValueOf(c, 1, len/2);
        	}
        	long val = Long.valueOf(s,2);
       count+=(val+1);
        	//N = Integer.valueOf)
        	N-=2;
        }
        System.out.println(count);
    }
    private static boolean isP(char[] c){
    	if(c.length<=1)return true;
    	for(int i = 0;i<c.length/2;i++){
    		int j = c.length-1-i;
    		if(c[i]!=c[j])
    			return false;
    	}
    	return true;
    }
}