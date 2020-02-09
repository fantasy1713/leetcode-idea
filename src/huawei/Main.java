package huawei;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
    public static void SwapWithZero(int[] array,int len,int n){
    	int zindex = 0,nindex =0;
    	for(int i =0;i<len;i++){
    		if(array[i]==0)zindex =i;
    		if(array[i]==n) nindex =i;
    	}
    	array[zindex] = n;
    	array[nindex] =0;
    }
}