<h2>This is a GeekForGeeks challenge: <a href="https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/">How to find Shortest Paths from Source to all Vertices using Dijkstra’s Algorithm</a></h2>

Given a weighted graph and a source vertex in the graph, find the shortest paths from the source to all the other vertices in the given graph.

<b>Note</b>: The given graph does not contain any negative edge.

<b>Examples:</b>

<b>Input</b>: src = 0, the graph is shown below.
![image](https://github.com/Caznik/DijkstraAlgorithm/assets/26796370/2e5579df-a4ff-4cce-9b94-f3b94c96176a)

<b>Output</b>: 0 4 12 19 21 11 9 8 14

<b>Explanation</b>:

The distance from 0 to 1 = 4.

The minimum distance from 0 to 2 = 12. 0->1->2

The minimum distance from 0 to 3 = 19. 0->1->2->3

The minimum distance from 0 to 4 = 21. 0->7->6->5->4

The minimum distance from 0 to 5 = 11. 0->7->6->5

The minimum distance from 0 to 6 = 9. 0->7->6

The minimum distance from 0 to 7 = 8. 0->7

The minimum distance from 0 to 8 = 14. 0->1->2->8
