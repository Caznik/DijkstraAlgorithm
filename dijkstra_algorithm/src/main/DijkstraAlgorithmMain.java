package main;

import java.util.ArrayList;
import java.util.List;

import algorithms.Dijkstra;
import comparators.NodeComparator;
import models.Graph;
import models.Node;

public class DijkstraAlgorithmMain {

    public static void main(String[] args) {
    	// Create nodes
        Node node0 = new Node("0"); Node node1 = new Node("1"); Node node2 = new Node("2"); Node node3 = new Node("3");
        Node node4 = new Node("4"); Node node5 = new Node("5"); Node node6 = new Node("6"); Node node7 = new Node("7");
        Node node8 = new Node("8");

        // Assign weight to nodes
        node0.addDestination(node1, 4); node0.addDestination(node7, 8);
        node1.addDestination(node2, 8); node1.addDestination(node7, 11);
        node2.addDestination(node1, 8); node2.addDestination(node3, 7); node2.addDestination(node5, 4); node2.addDestination(node8, 2);
        node3.addDestination(node2, 7); node3.addDestination(node4, 9); node3.addDestination(node5, 14);
        node4.addDestination(node3, 9); node4.addDestination(node5, 10);
        node5.addDestination(node4, 10); node5.addDestination(node3, 14); node5.addDestination(node2, 4); node5.addDestination(node6, 2);
        node6.addDestination(node5, 2); node6.addDestination(node8, 6); node6.addDestination(node7, 1);
        node7.addDestination(node6, 1); node7.addDestination(node8, 7); node7.addDestination(node0, 8);
        node8.addDestination(node2, 2); node8.addDestination(node6, 6); node8.addDestination(node7, 7);

        // Create graph
        Graph graph = new Graph();
        graph.addNode(node0); graph.addNode(node1); graph.addNode(node2); graph.addNode(node3); graph.addNode(node4);
        graph.addNode(node5); graph.addNode(node6); graph.addNode(node7); graph.addNode(node8);

        // Execute algorithm
        graph = Dijkstra.calculateShortestPathFromSource(graph, node0);

    	// Obtener los nodos del grafo y ordenarlos alfabéticamente
        List<Node> nodeList = new ArrayList<>(graph.getNodes());
        nodeList.sort(new NodeComparator());

        // Imprimir los caminos más cortos desde node0
        for (Node node : nodeList) {
            System.out.print("Distance from node 0 to node " + node.getName() + " is " + node.getDistance() + ". Path: ");
            for (Node pathNode : node.getShortestPath()) {
                System.out.print(pathNode.getName() + " -> ");
            }
            System.out.println(node.getName());
        }
    }

    
}
