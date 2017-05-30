import java.util.LinkedHashMap;

public class LRUCache {
    LinkedHashMap<Integer, Integer> LRUMap = null;
    int cacheSize = 0;
    public LRUCache(int capacity) {
        LRUMap = new LinkedHashMap<Integer,Integer>(capacity);
        cacheSize = capacity;
    }
    
    public int get(int key) {
        if(LRUMap.containsKey(key)){
            return LRUMap.get(key);
        }else
            return -1;
    }
    
    public void put(int key, int value) {
        // if(LRUMap.size()==cacheSize){
        //     LRUMap.removeEldestEntry();
        // }
        LRUMap.put(key,value);
    }
    
    public static void main(String args[]){
    	LRUCache obj = new LRUCache(2);
    	 obj.put(1,1);
    	 obj.put(2,2);
    	 obj.put(3,3);
    	 
    }
}