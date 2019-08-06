import java.util.LinkedList;
import java.util.Queue;





public class BinaryTree {
	
	static class Node{
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	
	static Node root;
	static Node temp = root;

	BinaryTree(int key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	static void inOrder(Node temp) {
		if(temp == null) return;
		
		inOrder(temp.left);
		System.out.print(temp.key + " ");
		inOrder(temp.right);
	}
	
	
	static void preOrder(Node temp) {
		if(temp == null) return;
		
		System.out.print(temp.key + " ");
		
		preOrder(temp.left);
		
		preOrder(temp.right);
	}
	
	static void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			}
			else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(key);
				break;
			}
			else {
				q.add(temp.right);
			}
			
				
		}
		
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
//		System.out.print( "\nInorder traversal before insertion:"); 
//		inOrder(root);
//		
//		System.out.print( "\nInorder traversal after insertion:"); 
//		int key = 6;
//		insert(root, key);
//		inOrder(root);
		
		preOrder(root);
		
	}

}
