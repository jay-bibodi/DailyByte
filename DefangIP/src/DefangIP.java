

/**
 * 
 * Given a valid IP address, defang it.
 * Note: To defang an IP address, replace every ”.”, with ”[.]”.
 * 
 * Ex: Given the following address…
 * 
 * address = "127.0.0.1", return "127[.]0[.]0[.]1"
 *
 */
public class DefangIP {
	public static void main(String arsg[]) {
		System.out.println(new DefangIP().defangIP("127.0.0.1"));
	}
	
	String defangIP(String ip) {
		
		if(ip == null || ip.isEmpty()) {
			return ip;
		}
		
		StringBuilder sObj = new StringBuilder();
		
		for(int i = 0;i<ip.length();i++) {
			char c = ip.charAt(i);
			if(c == '.') {
				sObj.append("[.]");
			} else {
				sObj.append(c);
			}
		}
		
		return sObj.toString();
	}
}
