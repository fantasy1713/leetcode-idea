package Lenovo;



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {// 注意while处理多个case
			String path = in.nextLine();
			String fileName = path.substring(path.lastIndexOf('\\'));
			int index = fileName.lastIndexOf('.')+1;
			if(index==0){
				System.out.println("NULL");
				continue;
			}
			String postfix = fileName.substring(index);
			System.out.println(postfix.toUpperCase());
		}
	}
}
