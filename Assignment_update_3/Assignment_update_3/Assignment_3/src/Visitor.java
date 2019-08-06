
public class Visitor implements IVisitor {
    int sumleaf=0;
    Tree t = new Tree();
	
	public void visit(Tree tree) {
		System.out.println("root: "+tree.root.data);
		
	}

	public void visit(LeafCompute leafCompute) { 
		
		leafSum(Tree.root);
		System.out.println("sum of Leafs: "+sumleaf);
		
	}
	
	
	public void visit(NodeCompute nodeCompute) { 
		    int nodeSum=nodeSum(Tree.root);
			System.out.println("sum of Nodes: "+nodeSum);		
		}
	
    /* Computes sum of nodes. */
	public int nodeSum(Node root)  
	{  
	    if (root == null)  
	        return 0;  
	    return (root.data + nodeSum(root.left) +nodeSum(root.right));  
	} 
    // sum of all leaf nodes 
    public int leafSum(Node root){ 
        if (root == null) 
            return sumleaf; 
       
        // add root data to sum if  
        // root is a leaf node 
        if (root.left == null && root.right == null) 
            sumleaf += root.data; 
       
        // propagate recursively in left 
        // and right subtree 
        leafSum(root.left); 
        leafSum(root.right); 
        return sumleaf;
    }
	
    

}
