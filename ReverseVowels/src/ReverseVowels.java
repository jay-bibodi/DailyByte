import java.util.HashSet;
import java.util.Set;

/**
 * This question is asked by Facebook. Given a string, reverse the vowels of it.
 * Note: In this problem y is not considered a vowel.
 * 
 * Ex: Given the following strings s…
 * 
 * s = "computer", return "cemputor"
 * Ex: Given the following strings s…
 *
 * s = "The Daily Byte", return "The Dialy Byte" 
 *
 */
public class ReverseVowels {
	 
	public static void main(String args[]) {
		String x = "computer";
		String y = "The Daily Byte";
		
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		System.out.println(new ReverseVowels().reverseVowels(x,vowels));
		System.out.println(new ReverseVowels().reverseVowels(y,vowels));
	}
	
	String reverseVowels(String str, Set<Character> vowels) {
		if(str == null || str.isEmpty()) {
			return str;
		}
		
		StringBuilder sbObj = new StringBuilder(str);
		
		int i = 0, j = sbObj.length()-1;
		
		while(i<j) {
			while(!vowels.contains(Character.toLowerCase(sbObj.charAt(i)))) {
				i++;
			}
			
			while(!vowels.contains(Character.toLowerCase(sbObj.charAt(j)))) {
				j--;
			}
			
			if(i<j) {
				char c = sbObj.charAt(i);
				sbObj.setCharAt(i, sbObj.charAt(j));
				sbObj.setCharAt(j, c);
				i++;
				j--;
			}
		}
		
		return sbObj.toString();
	}
}
