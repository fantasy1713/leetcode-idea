
public class Integer2Binary {

	public static void main(String[] args) {
		int n = -29;
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		System.out.println(NumberOf1(n));
	}
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
	public static int NumberOf1(int n) {

		int temp = n;
		int count = 0;
		while (temp != 0) {
			if ((0x01 & temp) == 1) {
				count++;
			}

			temp = temp >>> 1;//无符号右移
			System.out.println(Integer.toBinaryString(temp));
		}
		return count;
	}
}
