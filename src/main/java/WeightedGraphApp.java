public class WeightedGraphApp {
	public static void main(String[] args) {
		WeightedGraph weightedGraph = new WeightedGraph();

		weightedGraph.addVertex('A'); 										// 0 A
		weightedGraph.addVertex('B'); 										// 1 B
		weightedGraph.addVertex('C'); 										// 2 C
		weightedGraph.addVertex('D'); 										// 3 D
		weightedGraph.addVertex('E'); 										// 4 E

		weightedGraph.addEdgeNonOriented(0,1,6);				// A-B: 6
		weightedGraph.addEdgeNonOriented(0,4,4);				// A-E: 4
		weightedGraph.addEdgeNonOriented(1,0,6);				// B-A: 6
		weightedGraph.addEdgeNonOriented(1,2,2);				// B-C: 2
		weightedGraph.addEdgeNonOriented(1,3,4);				// B-D: 4
		weightedGraph.addEdgeNonOriented(2,1,3);				// C-B: 3
		weightedGraph.addEdgeNonOriented(2,3,1);				// C-D: 1
		weightedGraph.addEdgeNonOriented(2,4,7);				// C-E: 7
		weightedGraph.addEdgeNonOriented(3,1,8);				// D-B: 8
		weightedGraph.addEdgeNonOriented(4,1,5);				// E-B: 5
		weightedGraph.addEdgeNonOriented(4,3,7);				// E-D: 7


		weightedGraph.displayGraph();
	}
}