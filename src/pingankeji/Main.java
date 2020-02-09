package pingankeji;

/*import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
    	Set<Integer> set = new HashSet<Integer>();
    	int count = 0;
        for(int i=3000;i<3999;i++){
        	set.clear();
        	int temp  =i;
        	for(int j = 0;j<4;j++){
        		set.add(temp%10);
        		temp/=10;
        	}
        	if(set.size()==3){
        		count++;
        	}
        }
        System.out.println(count);
    }
}*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int count = 0;
            for(int i=5;i<=n;i+=5){
            	int temp = i;
            	while(temp%5==0){
            		count++;
            		temp /=5; 
            	}
            }
            System.out.println(count);
        }
    }
}