
/**
 * Given a positive integer N, return whether or not it has alternating bit values.
 * 
 * Ex: Given the following value for N…
 * 
 * N = 5, return true.
 * 5 in binary is 101 which alternates bit values between 0 and 1.
 * Ex: Given the following value for N…
 * 
 * N = 8, return false
 * 8 in binary is 1000 which does not alternate bit values between 0 and 1.
 *
 */
public class AlternatingBits {
	public static void main(String args[]) {
		System.out.println(new AlternatingBits().hasAlternatingBits(5));
		System.out.println(new AlternatingBits().hasAlternatingBits(8));
	}
	
	boolean hasAlternatingBits(int n) {
		int prevBit = n&1;
        n = n >> 1; 
        
        while(n > 0) {
            int currBit = n&1;
            
            if(currBit == prevBit)
                return false;
            
            n = n >> 1;
            prevBit = currBit;
        }
        
        return true;
	}
}