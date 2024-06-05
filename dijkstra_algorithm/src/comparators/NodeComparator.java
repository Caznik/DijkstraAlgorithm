package comparators;

import java.util.Comparator;

import models.Node;

public class NodeComparator implements Comparator<Node> {

	@Override
    public int compare(Node node1, Node node2) {
        return node1.getName().compareTo(node2.getName());
    }
}
