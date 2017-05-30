
public class SecondSmallestNumber {
	
	public static int secSmallest(int[] elements){
		int smallest = Integer.MAX_VALUE;
		int secSmallest = Integer.MAX_VALUE;
		for(int i : elements){
			if(i<smallest){
				secSmallest = smallest;
				smallest = i;
			}else if(i<secSmallest){
				secSmallest=i;
			}
		}
		return secSmallest;
	}
	
	public static void main(String[] args) {
		int[] elements = {3,1,5,2,7,6};
		System.out.println(secSmallest(elements));
	}

}
