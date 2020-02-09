import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	Test<Integer,Long> t = new Test(9);
	List<Integer> list =new ArrayList();
}

class Test<G,V>{
	public G value;
	public Test(G param){
		value = param;
	}
}
