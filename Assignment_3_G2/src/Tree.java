
public class Tree {
	Node root;
	int sum=0;
	int sumleaf=0;
	
	// Function to insert nodes in level order 
		public Node insertLevelOrder(int[] arr, Node root, int i) 
		{ 
			// Base case for recursion 
			if (i < arr.length) { 
				Node temp = new Node(arr[i]); 
				root = temp; 

				// insert left child 
				root.left = insertLevelOrder(arr, root.left, 2 * i + 1); 

				// insert right child 
				root.right = insertLevelOrder(arr, root.right,2 * i + 2); 
			} 
			return root; 
		} 

		// Function to print tree nodes in InOrder fashion 
		public void inOrder(Node root) 
		{ 
			if (root != null) 
			{ 
				inOrder(root.left); 
				System.out.print(root.data + " "); 
				inOrder(root.right); 
			} 
		} 
		
		/* Print nodes at the given level */
	    public void printGivenLevel (Node root ,int level) 
	    { 
	        if (root == null) 
	            return; 
	        if (level == 1) 
	            System.out.print(root.data + " "); 
	        else if (level > 1) 
	        { 
	            printGivenLevel(root.left, level-1); 
	            printGivenLevel(root.right, level-1); 
	        } 
	    }
	    
	    
	    /* Compute the "height" of a tree -- the number of 
	    nodes along the longest path from the root node 
	    down to the farthest leaf node.*/
	    public int height(Node root) 
	    { 
	        if (root == null) 
	           return 0; 
	        else
	        { 
	            /* compute  height of each subtree */
	            int lheight = height(root.left); 
	            int rheight = height(root.right); 
	              
	            /* use the larger one */
	            if (lheight > rheight) 
	                return(lheight+1); 
	            else return(rheight+1);  
	        } 
	    } 
	    
	    /* Computes the number of non-leaf nodes in a tree. */
	    public  void findSumLeaf(Node root,int sum)  
	    {  
	        // Base cases.  
	        if (root == null || (root.left == null &&root.right == null))  
	            return ;  
	        
	        // if current node is non-leaf, 
	        // calculate product and sum 
	        if (root.left != null || root.right != null) 
	        { 
	            this.sum += root.data; 
	        } 
	        // If root is Not NULL and its one of its  
	        // child is also not NULL  
	        findSumLeaf(root.left, this.sum); 
	        findSumLeaf(root.right, this.sum); 
	    }
	    
	    // utility function which calculates 
	    // sum of all leaf nodes 
	    public void leafSum(Node root){ 
	        if (root == null) 
	            return; 
	       
	        // add root data to sum if  
	        // root is a leaf node 
	        if (root.left == null && root.right == null) 
	            sumleaf += root.data; 
	       
	        // propagate recursively in left 
	        // and right subtree 
	        leafSum(root.left); 
	        leafSum(root.right); 
	    }
	    
	    
	    public Node getknownNode(Node root){
	    	
	    	Node mostLeftNood = null;
	    	    
	    	while(root!=null) {
	    		
	    		if(root.left==null) {
	    			
	    			mostLeftNood = root;
	    			
	    			break;
	    		}
	    		else {
	    			root = root.left;
	    		}
	    		//leafSum(root.left);
	    	}
	    	     	
	    	return mostLeftNood;
	    }
	    
		/* function to print level order traversal of tree*/
	    public void printLevelOrder() 
	    { 
	        int h = height(root); 
	        int i; 
	        for (i=1; i<=h; i++){
	            printGivenLevel(root, i); 
	            System.out.println();
	        }
	    }
	    
	
}
