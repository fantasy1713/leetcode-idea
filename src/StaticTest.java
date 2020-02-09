
public class StaticTest {
	float f = 1.0f;
	static float sf = 1.1f;
	
	public void test(){
		System.out.println(StaticTest.sf);
		System.out.println(new StaticTest().sf);
		
		StaticTest.stest();
		new StaticTest().stest();
	}
	
	public static void stest(){
		System.out.println(StaticTest.sf);
		System.out.println(new StaticTest().sf);
		
		//System.out.println(f);//编译不过
		System.out.println(new StaticTest().f);
	}
	
	public static void main(String []  args){
		StaticTest st = new StaticTest();
		System.out.println(st.f);
		
		System.out.println(sf);
		System.out.println(StaticTest.sf);
		System.out.println(new StaticTest().sf);
		
	}
}
