import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * Daily Byte
 * 
 * Iterative inorder Traversal
 * 
 * Given a binary tree, return a list containing its inorder traversal without using recursion.
 *
 * Ex: Given the following tree…
 * 
 *       2     
 *      / \   
 *     1   3
 * return [1, 2, 3]
 * Ex: Given the following tree…
 *
 *       2
 *      / \
 *     1   7
 *    / \
 *   4   8
 * return [4, 1, 8, 2, 7]
 *
 */

class Node 
{
	Integer nodeValue;
	Node leftNode, rightNode;

	Node(Integer nodeValue) 
	{
		this.nodeValue = nodeValue;
		leftNode = rightNode = null;
	}
}

public class IterativeInorderTraversal {

	
	public static void main(String args[]) {
		
		Node root = new Node(2);
		root.leftNode = new Node(1);
		root.rightNode = new Node(3);
		
		new IterativeInorderTraversal().iterativeInorderTraversal(root);
		
		System.out.println();
		
		root = new Node(2);
		root.leftNode = new Node(1);
		root.rightNode = new Node(7);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(8);
		
		new IterativeInorderTraversal().iterativeInorderTraversal(root);
	}
	
	
	private void iterativeInorderTraversal(Node root) {
		Deque<Node> deque = new LinkedList<Node>();
		Node node = root;
		
		
		while(true) {
			// if node is not null or if node is not leaf node
			if(node != null) {
				deque.addFirst(node);
				node = node.leftNode;
			} else {
				
				// if deque is empty we are done
				if(deque.isEmpty())
					break;
				
				// remove top element from the deque
				node = deque.pollFirst();
				
				// print the element
				System.out.print(node.nodeValue+ " ");
				
				// make node as right node. ----> 1's right is null so again 
				// it will come to else clause and remove the root, printing left, root, right
				node = node.rightNode;
			}
		}	
	}
}