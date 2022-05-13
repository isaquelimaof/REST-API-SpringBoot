package br.com.springboot.curso_jdev_treinamento.testeModelo;

public class Edge {
	
	private Vertex vertexBegin;
	private Vertex vertexEnd;
	private int weight;

	public Edge(Vertex vertexBegin, Vertex vertexEnd, int weight){
		this.vertexBegin = vertexBegin;
		this.vertexEnd = vertexEnd;
		this.weight = weight;
	}

	public Vertex getVertexBegin(){
		return this.vertexBegin;
	}

	public Vertex getVertexEnd(){
		return this.vertexEnd;
	}

	public int getWeight(){
		return this.weight;
	}
}