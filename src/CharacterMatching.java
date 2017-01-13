import java.util.ArrayList;
import java.util.Stack;

public class CharacterMatching {
	static Stack<Character> s = new Stack<Character>();
	public static void charMatching(String str){
		char[] strArr = str.toCharArray();
		int count=0;
		
		int index=0;
		for(int i=0;i<strArr.length;i++){
			
			if(!s.empty()){
				char c = s.peek();
				if(Character.isUpperCase(c) && (Character.isUpperCase(strArr[i]))){
					count++;
					s.push(strArr[i]);
					
				}
				else if(Math.abs((int)c-(int)strArr[i])==32) {
					index=i;
					count ++;
					s.pop();
					
				}
				else{
					System.out.println(index);
					break;
				}
			}else{
				s.push(strArr[i]);
			}
		}
		
			System.out.println(index);
		
	}
	public static void main(String[] args) {
		String str = "JNHUuhnjSKTtks";
		charMatching(str);
	}

}
