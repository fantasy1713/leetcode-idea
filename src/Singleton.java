
//public class Singleton {
//	private static Singleton instance= null;
//	private Singleton(){}
//	public static Singleton getInstance(){
//		if(instance==null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
//}


//public class Singleton{
//	private static Singleton instance = null;
//	private Singleton(){}
//	
//	public static Singleton getInstance(){
//		if(instance==null){
//			synchronized(instance){
//				if(instance==null){
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
//}

public class Singleton{
	private Singleton(){}
	private static class StaticFactory{
		private static Singleton instance = new Singleton();
	}
	public static Singleton getInstance(){
		return StaticFactory.instance;
	}
}