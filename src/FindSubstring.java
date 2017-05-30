
public class FindSubstring {

	public static boolean checkSubstring(String mainString, String str){
	if(mainString == null || mainString == "") return false;
	if(str == null || str == "") return false;
	int j=0;
	for(int i=0; i<mainString.length();i++){
		int k = i;
		if(mainString.charAt(i) == str.charAt(j)){
			while(j<str.length() && mainString.charAt(i) == str.charAt(j)){
				i++;j++;
			}
			if(j==str.length()) return true;
			else{
				i=k;
				j=0;
			}
		}
			
	}
		return false;
	}
	public static void main(String[] args) {
		String mainString = "abate";
		String str = "aba";
		System.out.println(checkSubstring(mainString,str));

	}

}
