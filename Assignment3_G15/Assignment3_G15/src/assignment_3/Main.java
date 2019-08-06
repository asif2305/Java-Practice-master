package assignment_3;

public class Main {

	public static void main(String[] args) {
		
		//Create Tree:
		//root
		Node rootNode = new Node(5, null, null);
		//level1
		Node n8 = new Node(8, rootNode, null);
		Node n7 = new Node(7, rootNode, n8);
		//level2
		Node n13 = new Node(13, n8, null);
		Node n21 = new Node(21, n8, n13);
		Node n20 = new Node(20, n7, n21);
		Node n15 = new Node(15, n7, n20);
		//level3
		Node n42 = new Node(42, n20, null);
		Node n11 = new Node(11, n15, n42);
		Node bottomLeftNode = new Node(18, n15, n11);
		
		//root Value
		RootValue RootValueInstance = new RootValue();
		bottomLeftNode.convinientOrder(RootValueInstance, true);
		System.out.println("The value of the trees root node is: " + RootValueInstance.getRootValue());
		
		//Sum of all values
		TreeSum TreeSumInstance = new TreeSum();
		bottomLeftNode.convinientOrder(TreeSumInstance, true);
		System.out.println("The combined value of the all the trees nodes is: " + TreeSumInstance.getSum());
		

		//Sum of all leafs
		LeafSum LeafSumInstance = new LeafSum();		
		bottomLeftNode.convinientOrder(LeafSumInstance, true);
		System.out.println("The combined value of the all the trees leafs is: " + LeafSumInstance.getLeafSum());
	}

}
