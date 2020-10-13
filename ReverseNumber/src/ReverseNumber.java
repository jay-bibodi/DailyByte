
/**
 * 
 * Given a 32 bit signed integer, reverse it and return the result.
 * Note: You may assume that the reversed integer will always fit within the bounds of the integer data type.
 * 
 * Ex: Given the following integer num…
 * 
 * num = 550, return 55
 * Ex: Given the following integer num…
 * 
 * num = -37, return -73
 *
 */
public class ReverseNumber {
	public static void main(String args[]) {
		System.out.println(new ReverseNumber().reverseNumber(550));
		System.out.println(new ReverseNumber().reverseNumber(-37));
	}
	
	int reverseNumber(int x) {
		boolean isNegative = false;
        if(x<0) {
            isNegative = true;
            x = x*-1;
        }
        
        long reversed = 0;
        while(x>0) {
            reversed = (reversed*10) + (x%10);
            x /= 10;
        }
        
        if(reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return isNegative ? (int) (-1*reversed) : (int) reversed;
	}
}
