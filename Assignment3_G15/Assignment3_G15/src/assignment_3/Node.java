package assignment_3;
import java.lang.Comparable;

public class Node<G> implements Comparable{
	private int value;
	private Node<G> parent = null;
	private Node<G> rightNeighbor = null;
	
	Node(int value, Node<G> parent, Node<G> rightNeighbor){
		this.value = value;
		this.parent = parent;
		this.rightNeighbor = rightNeighbor;
	}
	
	/**
	 * visits all the nodes in the tree starting from the bottom left node going right, the upwards
	 * @param visitor: bottom left node of the tree you want to visit
	 * @param newLine: Set to true. Tells the recursive function whether the current Node is at the beginning of a new line (true). Makes sure every Node is visited exactly once
	 */
	void convinientOrder(IVisitor<G> visitor, Boolean newLine) {
		visitor.process(this);
		if (null != (rightNeighbor)) {
			rightNeighbor.convinientOrder(visitor, false);
		}
		if (null != (parent) && newLine) {
			parent.convinientOrder(visitor, true);
		}
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node<G> getParent() {
		return parent;
	}
	public void setParent(Node<G> parent) {
		this.parent = parent;
	}
	public Node<G> getRightNeighbor() {
		return rightNeighbor;
	}
	public void setRightNeighbor(Node<G> rightNeighbor) {
		this.rightNeighbor = rightNeighbor;
	}
	
	@Override
	public int compareTo(Object arg0) {
		if(arg0 == null) {
			throw new NullPointerException();
		}
		if(this == arg0) {
			return 0;
		}
		else return 1;
	}
	
	
	
	
	
}
