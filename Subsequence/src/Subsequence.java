
/**
 * 
 * Given two strings s and t return whether or not s is a subsequence of t.
 * Note: You may assume both s and t only consist of lowercase characters and both have a length of at least one.
 * 
 * Ex: Given the following strings s and t…
 *
 * s = "abc", t = "aabbcc", return true.
 * Ex: Given the following strings s and t…
 * 
 * s = "cpu", t = "computer", return true.
 * Ex: Given the following strings s and t…
 *
 * s = "xyz", t = "axbyc", return false.
 *
 */
public class Subsequence {
	public static void main(String args[]) {
		String s = "abc", t = "aabbcc";
		System.out.println(new Subsequence().isSubsequence(s, t));
		
		s = "cpu"; t = "computer";
		System.out.println(new Subsequence().isSubsequence(s, t));
		
		s = "xyz"; t = "axbyc";
		System.out.println(new Subsequence().isSubsequence(s, t));
	}
	
	boolean isSubsequence(String s, String t) {
		if(s == null || s.isEmpty()) 
			return false;
		
		int index = 0;
		
		for(int i = 0;i<t.length();i++) {
			if(t.charAt(i) == s.charAt(index)) {
				index++;
			}
			
			if(index >= s.length())
				return true;
		}
		
		return false;
	}
}
