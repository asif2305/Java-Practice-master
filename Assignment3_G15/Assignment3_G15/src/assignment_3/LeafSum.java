package assignment_3;

import java.util.Set;
import java.util.TreeSet;
public class LeafSum<G> implements IVisitor<G> {
	Set<Node<G>> allNodes = new TreeSet<Node<G>>();
	Set<Node<G>> notLeafNodes = new TreeSet<Node<G>>();
	
	@Override
	public void process(Node<G> node) {
		allNodes.add(node);
		if(node.getParent()!= null) {
			notLeafNodes.add(node.getParent());
		}

	}
	
	private Set<Node<G>> getLeafs(){
		Set<Node<G>> leafNodes = allNodes;
		leafNodes.removeAll(notLeafNodes);
		return leafNodes;
	}
	
	private int sumNodes(Set<Node<G>> nodes) {
		int sum = 0;
		for(Node<G> node: nodes) {
			sum = sum + node.getValue();
		}
		return sum;
	}

	public int getLeafSum() {
		return sumNodes(getLeafs());
	}

}
