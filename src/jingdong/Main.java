package jingdong;

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args)  {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String a = in.next();
//        String b = in.next();
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0;i<n;i++){
//        	char achar = a.charAt(i);
//        	char bchar = b.charAt(i);
//        	if(achar==bchar){
//        		sb.append(0);
//        	}else{
//        		sb.append(1);
//        	}
//        }
//        int result = 0;
//        for(int i=n-1;i>=0;i--){
//        	if(sb.charAt(i)=='1')
//        	result = (int) (result+(Math.pow(2, (n-i-1))));
//        }
//        System.out.println(result);
//	}
//}




import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        int[]_p = new int[n];
        for(int i = 0;i<n;i++){
        	p[i] = in.nextInt();
        	_p[i] = 100-p[i];
        }
        int limit = (int) Math.ceil(n*0.6);
        double rate = 0;
        for(int i=limit;i<=n;i++){
        	rate = rate+(calculate(p,_p,i,n));
        }
        print(rate);
	}
	private static void print(double data){
		if(data>=1){
			System.out.print("1.00000");
			return;
		}
		System.out.print("0.");
		int[] result = new int[5];
		for(int i=0;i<5;i++){
			data*=10;
			int c = (int)Math.floor(data);
			data-=c;
			result[i] = c;
		}
		data*=10;
		if((int)Math.floor(data)>=5){
			result[4]++;
		}
		for(int i = 4;i>0;i--){
			int s = result[i]/10;
			result[i]%=10;
			result[i-1]+=s;
		}
		for(int i=0;i<5;i++){
			System.out.print(result[i]);
		}
		
	}
	private static double calculate(int[] p,int [] _p,int limit,int n){
		int[] a = new int[n];
		
		for(int i=0;i<limit;i++){
			a[i] = 1;
		}
		double rate = 1;
		for(int i =0;i<n;i++){
			if(a[i]==1)rate*=p[i];
			else rate*=_p[i];
			rate/=100;
		}
		int len = n;
		for(int i = 0;i<len-1;i++){
			for(int j =0;j<len-1-i;j++){
				if(a[j]>a[j+1]){
					int temp  = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//
					double tempRate = 1;
					for(int k =0;k<n;k++){
						if(a[k]==1)tempRate*=p[k];
						else tempRate*=_p[k];
						tempRate/=100;
					}
					rate +=tempRate;
				}
			}
		}
		return rate;
	}
	
}
