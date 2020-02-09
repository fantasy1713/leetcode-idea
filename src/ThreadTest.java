import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadTest {
	public static void main(String[] agrs){
		ArrayList<Object> result = new ArrayList<Object>();
		MyThread t =new MyThread(8, result);
		t.start();
		
		//
		
		ExecutorService pool  = Executors.newFixedThreadPool(5);
        Callable[] calls=new Callable[5];
        Future[] fu = new Future[5];
       
        
		
	}
	
}
class MyCall implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}


class MyThread extends Thread{
	private int dataIn;
	private ArrayList<Object> result;
	private String s="";
	public MyThread(int data,ArrayList<Object> result){
		this.dataIn = data;
		this.result = result;
	}
	public void run(){
		synchronized (s) {
			while (true) {
				try {
					//sleep(1000);
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(dataIn);
			}
			//result.add(dataIn+1);
		}
	}
}
interface A extends Runnable{
	
}
