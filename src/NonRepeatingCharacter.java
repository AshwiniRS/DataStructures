
public class NonRepeatingCharacter {
	public char firstUniqChar(String s) {
		int[] chars = new int[26];
		
		for(char c:s.toCharArray()){
			int i = (int)Character.toLowerCase(c) - 97;
			chars[i]++;
		}
		
	    for(char c : s.toCharArray()){
	    	int i = (int)Character.toLowerCase(c) - 97;
	    	if(chars[i]==1){
	    		return (char) ((char)i + (char)97);
	    	}
	    }
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vivek";
		NonRepeatingCharacter nrc = new NonRepeatingCharacter();
		System.out.println(nrc.firstUniqChar(str));
	}

}
