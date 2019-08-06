
public class NodeCompute implements ITree {
	//Node rootNode;
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);	
	}
	

}
