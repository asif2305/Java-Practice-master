package assignment_3;

public class RootValue<G> implements IVisitor<G> {
	private int rootValue = 0;
	
	@Override
	public void process(Node<G> node) {
		if(node.getParent()==null) {
			rootValue = node.getValue();
		}
	}

	public int getRootValue() {
		return rootValue;
	}
}
