
public class ArrayTest {

	
	
	public static void main(String[] args){
	
		String s = "abc";
		
		char[] chars = {'a','b','c'};
		
		
		System.out.println(s.equals(chars));
		System.out.println(chars.equals(s));
		
		
		String s1 = "aa";
		String s2 = "a"+new String("a");
		String s3 = "a"+"a";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
