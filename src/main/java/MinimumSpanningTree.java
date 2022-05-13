public class MinimumSpanningTree {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex('A');				//A 0
		graph.addVertex('B');				//B 1
		graph.addVertex('C');				//C 2
		graph.addVertex('D');				//D 3
		graph.addVertex('E');				//E 4
		graph.addVertex('F');				//F 5
		graph.addVertex('G');				//G 6
		graph.addVertex('H');				//H 7

		graph.addEdge(0,1);						//AB
		graph.addEdge(0,2);						//AC
		graph.addEdge(0,3);						//AD		

		graph.addEdge(1,0);						//BA
		graph.addEdge(1,2);						//BC
		graph.addEdge(1,5);						//BF
		graph.addEdge(1,6);						//BG

		graph.addEdge(2,0);						//CA
		graph.addEdge(2,1);						//CB
		graph.addEdge(2,7);						//CH

		graph.addEdge(3,0);						//DA
		graph.addEdge(3,4);						//DE
		graph.addEdge(3,5);						//DF
		graph.addEdge(3,6);						//DG

		graph.addEdge(4,3);						//ED
		graph.addEdge(4,6);						//EG

		graph.addEdge(5,1);						//FB
		graph.addEdge(5,3);						//FD
		graph.addEdge(5,6);						//FG

		graph.addEdge(6,1);						//GB
		graph.addEdge(6,4);						//GE
		graph.addEdge(6,5);						//GF
		graph.addEdge(6,7);						//GH

		graph.addEdge(7,2);						//HC
		graph.addEdge(7,6);						//HG

		graph.minimumSpanningTree();
	}
}