
/**
 * 
 * Given two strings, passage and text return whether or not the characters in text can be used to form the given passage.
 * Note: Each character in text may only be used once and passage and text will only contain lowercase alphabetical characters.
 * 
 * Ex: Given the following passage and text…
 *
 * passage = "bat", text = "cat", return false.
 * Ex: Given the following passage and text…
 *
 * passage = "dog" text = "didnotgo", return true.
 *
 */
public class CharacterScramble {
	public static void main(String args[]) {
		String passage = "bat", text = "cat";
		System.out.println(new CharacterScramble().characterScramble(passage, text));
		
		passage = "dog"; text = "didnotgo";
		System.out.println(new CharacterScramble().characterScramble(passage, text));
	}
	
	boolean characterScramble(String passage, String text) {
		int charCount[] = new int[26];
		
		for(int i=0;i<text.length();i++) {
			int index = text.charAt(i) - 'a';
			charCount[index] = charCount[index] + 1;  
		}
		
		for(int i=0;i<passage.length();i++) {
			int index = passage.charAt(i) -'a';
			
			if(charCount[index] == 0) {
				return false;
			}
			
			charCount[index]--;
		}
		
		return true;
	}
}
