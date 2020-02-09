
public class PI {

	public static void main(String[] args){
		double x=2, z=2;
		  int a=1, b=3;
		  while(z>1e-15)
		  {
		    z = z*a/b;
		    x += z;
		    a++;
		    b+=2;
		  }
		  System.out.println(x);
		  System.out.println(a+" "+b+" "+z);
	}
	public  void main() {
		int N = 1001;
		int s = 1;// 整数部分
		int[] a = new int[N];// 小数部分
		for (int n = 1; n < N; n++) {
			int sign = (n%2==0)?1:-1;
			int r = 1;
			int d = 1+2*n;
			s = s+sign*r/d;
			r = r%d;
			
			int[] b = new int[N];
			for(int i=0;i<N;i++){
				b[i] = r*10/d;
				r = r*10%d;
			}
			for(int i = N-1;i>0;i--){
				b[i-1] =b[i-1]+b[i]/10;
				b[i] = b[i]%10;
			}
			for(int i = N-1;i>=0;i--){
				a[i] = a[i]+sign*b[i];
			}
			for(int i = N-1;i>0;i--){
				if(sign>0){
					a[i-1] += a[i]/10;
					a[i] = a[i]%10;
				}else{
					if(a[i]<0){
						a[i-1]--;
						a[i] +=10;
					}
				}
			}
			if(sign>0){
				s = s+a[0]/10;
				a[0] = a[0]%10;
			}else{
				if(a[0]<0){
					s--;
					a[0] +=10;
				}
			}
			
		}
		//*4
		s*=4;
		for(int i = 0;i<N;i++){
			a[i]*=4;
		}
		for(int i = N-1;i>0;i--){
			a[i-1] =a[i-1]+a[i]/10;
			a[i] = a[i]%10;
		}
		s = s+a[0]/10;
		a[0] = a[0]%10;
		
		
		//
		System.out.print(s+".");
		for(int i = 0;i<N;i++){
			System.out.print(a[i]);
		}

	}

}
