package br.com.springboot.curso_jdev_treinamento.testeModelo;

public class Vertex {
	private char label;
	private boolean wasVisited;

	public Vertex(char label){
		this.label = label;
	}

	public char getLabel(){
		return this.label;
	}

	public void setLabel(char label){
		this.label = label;
	}

	public boolean getWasVisited(){
		return this.wasVisited;
	}

	public void setWasVisited(boolean wasVisited){
		this.wasVisited = wasVisited;
	}
}