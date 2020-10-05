
/**
 * 
 * Given a character array, compress it in place and return the new length of the array.
 * Note: You should only compress the array if its compressed form will be at least as short as the length of its original form.
 * 
 * Ex: Given the following character array chars…
 * 
 * chars = ['a', 'a', 'a', 'a', 'a', 'a'], return 2.
 * chars should be compressed to look like the following:
 * chars = ['a', '6']
 * Ex: Given the following character array chars…
 * 
 * chars = ['a', 'a', 'b', 'b', 'c', 'c'], return 6.
 * chars should be compressed to look like the following:
 * chars = ['a', '2', 'b', '2', 'c', '2']
 * Ex: Given the following character array chars…
 * 
 * chars = ['a', 'b', 'c'], return 3.
 * In this case we chose not to compress chars.
 *
 */
public class StringCompression {
	public static void main(String args[]) {
		System.out.println(new StringCompression().compressString("aaaaaa".toCharArray()));  // len is 2, because ['a','2']
		System.out.println(new StringCompression().compressString("aabbcc".toCharArray())); // len is 6 because ['a','2','b','2','c','2']
		System.out.println(new StringCompression().compressString("abc".toCharArray()));
		System.out.println(new StringCompression().compressString("a".toCharArray()));
		System.out.println(new StringCompression().compressString("abbbbbbbbbbbb".toCharArray()));
	}
	
	int compressString(char[] chars) {
		// keep track of the current index where we want to place the count of previously seen character. like a 2, b 2 etc
		int index = 0;
		
		// initialize i = 0 
		int i = 0;
		
		while(i<chars.length) {
			// initialize j = i
			int j = i;
			
			// j is less then char length, and char at j is == char at i then increment j by 1.
			while(j<chars.length && chars[j] == chars[i]) {
				j++;
			}
			
			// copy char at i to char at index and increment the index by 1.
			chars[index++] = chars[i];
			
			// now we only consider count if j - i > 1, because if input is ['a'], we don't 
			// want output arr len as 2 ['a','1'] we want output arr len as 1, so we consider count only when count is > 1
			if(j-i>1) {
				// count to string as we want to store each element individually in the array.
				String count = j-i + "";
				for(char c:count.toCharArray()) {
					chars[index++] = c;
				}
			}
			
			// i will point to j, as we have processed everything until j-1 in the inner while loop. 
			// So i will point to the new/different/character seen for the first time
			i = j;
		}
		
		// return index
		return index;
	}
}