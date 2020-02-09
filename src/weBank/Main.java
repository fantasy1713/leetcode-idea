package weBank;

import java.util.HashMap;
import java.util.Map;

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
        	int n = in.nextInt();
        	
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int count = 0;
            int sum =0;
            for(int i=0;i<=a;i++){
            	if(5*i>n){
            		break;
            	}
            	for(int j =0;j<=b;j++){
            		if((5*i+8*j)>n){
            			break;
            		}
            		for(int k =0;k<=c;k++){
            			if((5*i+8*j+10*k)>n){
            				break;
            			}
            			if((5*i+8*j+10*k)==n){
            				count++;
            			}
            		}
            	}
            }
            System.out.println(count);
        }
    }
    
}*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
        	HashMap<String,Integer> map = new HashMap<String,Integer>();
        	int a[][] = new int[4][4];
        	boolean hasdot = false;
        	boolean flag = true;//标识平行
        	int temp = 0;
        	int x =0,y = 0;
        	for(int i=0;i<4;i++){
        		for(int j=0;j<4;j++){
        			a[i][j] = in.nextInt();
        		}
        		String str = ""+a[i][0]+a[i][1];
        		if(map.containsKey(str)){
        			map.put(str, 2);
        		}else{
        			map.put(str, 1);
        		}
        		str = ""+a[i][2]+a[i][3];
        		if(map.containsKey(str)){
        			map.put(str, 2);
        		}else{
        			map.put(str, 1);
        		}
        		int len = (int)Math.sqrt(Math.pow(a[i][0]-a[i][2],2)+Math.pow(a[i][1]-a[i][3],2));
        		if(len==0){
        			
        			hasdot = true;
        		}
        		temp^=len;
        		if((a[i][0]-a[i][2])!=0&&(a[i][1]-a[i][3])!=0){
        			flag = false;
        		}
        		if((a[i][0]-a[i][2])==0)y+=1;
        		if((a[i][1]-a[i][3])==0)x +=1;
        	}
        	boolean connected = true;//标识是否收尾相连
        	for(Map.Entry<String, Integer> en:map.entrySet()){
        		if(en.getValue()!=2){
        			connected = false;
        		}
        	}
        	boolean hasSameLine = false;
        	for(int i = 0;i<3;i++){
        		for(int j=i+1;j<4;j++){
        			String tem_i = ""+a[i][0]+a[i][1]+a[i][2]+a[i][3];
        			if(tem_i.equals(""+a[j][0]+a[j][1]+a[j][2]+a[j][3])||tem_i.equals(""+a[j][2]+a[j][3]+a[j][0]+a[j][1])){
        				hasSameLine = true;
        			}
        		}
        	}
        	if(hasdot||!flag||temp!=0||!connected||map.size()!=4||x!=2||y!=2||hasSameLine){
        		System.out.println("NO");
        		
        	}else{
        		System.out.println("YES");
        	}    
        }
    }  
}