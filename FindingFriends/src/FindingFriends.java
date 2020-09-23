
/**
 * 
 * Daily Byte
 * 
 * Finding Friends or Number of Islands
 * 
 * This question is asked by Facebook. You are given a two dimensional matrix,friends, that represents relationships 
 * between coworkers in an office. If friends[i][j] = 1 then coworker i is friends with coworker j and coworker j is 
 * friends with coworker i. Similarly if friends[i][j] = 0 then coworker i is not friends with coworker j and coworker 
 * j is not friend with coworker i. Friendships in the office are transitive (i.e. if coworker one is friends with coworker 
 * two and coworker two is friends with coworker three, coworker one is also friends with coworker three). 
 * Given the friendships in the office defined by friends, return the total number of distinct friends groups in the office.
 * 
 * Note: Each coworker is friends with themselves (i.e.matrix[i][j] = 1 for all values where i = j)
 *
 * Ex: Given the following matrix friends…
 * 
 * friends = [
 *   [1, 1, 0],
 *   [1, 1, 0],
 *   [0, 0, 1]
 * ], return 2.
 * The 0th and 1st coworkers are friends with one another (first friend group).
 * The 2nd coworker is friends with themself (second friend group).
 *
 */
public class FindingFriends {
	public static void main(String args[]) {
		
		int [][] friends = {{1,1,0},{1,1,0},{0,0,1}};
		
		int friendsGroup = new FindingFriends().findFriendsGroup(friends);
		
		System.out.println(friendsGroup);
	}

	private int findFriendsGroup(int[][] friends) {
		int count = 0;
		
		if(friends == null || friends.length == 0)
			return 0;
		
		for(int i = 0;i<friends.length;i++) {
			for(int j=0;j<friends[i].length;j++) {
				if(friends[i][j] == 1) {
					count++;
					findTransitiveFriends(friends,i,j);
				}
			}
		}
		
		return count;
		
	}

	private void findTransitiveFriends(int[][] friends, int i, int j) {
		if(i<0 || i>=friends.length || j<0 || j >= friends[0].length || friends[i][j] == 0)
			return;
		
		friends[i][j] = 0;
		findTransitiveFriends(friends, i-1, j);
		findTransitiveFriends(friends, i+1, j);
		findTransitiveFriends(friends, i, j-1);
		findTransitiveFriends(friends, i, j+1);
	}
}
