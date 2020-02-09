
public class e {

	
//	public static void main(String[] args){
//		int N = 20;
//	    int a[] =new int[1000];     //定义一个数组
//	    int s = 1;    //s用来存放整数部分
//	    for ( int n = N; n >= 1; n-- )
//	    {
//	        int r = s%n;
//	        s = s / n + 1;
//	        int i = 0;
//	        for ( ; i<N; i++ )
//	        {
//	            r = r * 10 + a[ i ];
//	            a[ i ] = r / n;
//	            r %= n;
//	        }
//	        for ( i = N - 1; i>0; i-- )
//	        {
//	            a[ i - 1 ] += a[ i ] / 10;
//	            a[ i ] %= 10;
//	        }
//	        s += a[ 0 ] / 10;
//	        a[ 0 ] %= 10;
//	    }
//	    System.out.print(s+".");
//	    for ( int i = 0; i < N; i++ )
//	    {
//	    	System.out.print( a[ i ]);
//	    }
//	    System.out.println();
//	    return ;
//	}
	
	public static void main(String [] args){
		int N = 20;
		int s  =1;//存放整数部分
		int [] a = new int[N];
		int r=0;//存放余数部分
		r = s%N;
		for(int i=N;i>0;i--){
			r = s%i;
			s = s/i +1;
			//将余数r/i 的结果放进数组a
			for(int j=0;j<N;j++){
				r = r*10+a[j];
				a[j] = r/i;
				r = r%i;
			}
			//a数组进位
			for(int j = N-1;j>0;j--){
				a[j-1] += a[j]/10;
				a[j] = a[j]%10;
			}
			s +=a[0]/10;
			a[0] = a[0]%10;
			
		}
		System.out.print(s+".");
		for(int i= 0;i<N;i++){
			System.out.print(a[i]);
		}
	}
}
