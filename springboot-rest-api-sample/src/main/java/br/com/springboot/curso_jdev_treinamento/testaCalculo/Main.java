package br.com.springboot.curso_jdev_treinamento.testaCalculo;

public class Main {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<String>();
		grafo.adcionarVertice("A");
		grafo.adcionarVertice("B");
		grafo.adcionarVertice("C");
		grafo.adcionarVertice("D");
		grafo.adcionarVertice("E");

		grafo.adcionarAresta(8.0, "A", "B");
		grafo.adcionarAresta(6.0, "E", "C");
		grafo.adcionarAresta(5.0, "A", "D");
		grafo.adcionarAresta(9.0, "D", "A");
		grafo.adcionarAresta(8.0, "E", "A");

		grafo.buscaEmLargura();

	}
}
