import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Integer,Object> map = new HashMap<Integer,Object>();
		Set<String> set = new HashSet<String>();
		Queue<String> qu = new LinkedList<String>();
		qu.offer("");
		Queue<Integer> q = new PriorityQueue<Integer>(5,new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b){
				return a-b;
			}
		});
		
		
		Map<String ,String>	lmap = new LinkedHashMap<String,String>();

	}

}
