
public class Main {

	public static void main(String[] args) {

        Tree t2 = new Tree(); 
		
		int arr[] = { 5, 7, 8, 15, 20, 21, 13, 18, 11,42 }; //5,7,8,15,20,21,13,18,11,42
		t2.root = t2.insertLevelOrder(arr, t2.root, 0); 
		//System.out.println("root test = "+t2.root.data);
		
		t2.findSumLeaf(t2.root, t2.sum) ;
		t2.leafSum(t2.root);
		System.out.println("root node = "+ t2.root.data);
		System.out.println("sum of nodes = " +t2.sum);
		System.out.println("sum of leafs = " +t2.sumleaf);
				
		//t2.root = t2.getknownNode(t2.root);
		
		
	   // t2.getRootNode();		
		System.out.println("binary tree");
		t2.printLevelOrder();

	}

}
