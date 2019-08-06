package assignment_3;

public class TreeSum<G> implements IVisitor<G> {
	int sum = 0;
	
	@Override
	public void process(Node<G> node) {
		sum = sum + node.getValue();
	}
	
	public int getSum() {
		return sum;
	}
	

}
