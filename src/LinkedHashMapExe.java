import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExe {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>(10,(float) 0.75,true);
		lmap.put(1, "Ashwini");
		lmap.put(2, "Vivek");
		lmap.put(3, "Viviv");
		
		
		lmap.get(2);
		for(Entry<Integer, String> i : lmap.entrySet()){
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
	
	}

}
