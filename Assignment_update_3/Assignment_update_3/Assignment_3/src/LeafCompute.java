
public class LeafCompute implements ITree {
	//Node rootNode;
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);	
	}
	

}
