package br.com.springboot.curso_jdev_treinamento.testaCalculo;

import java.util.ArrayList;

public class Vertice<TIPO> {

	private TIPO dado;
	private ArrayList<Aresta<TIPO>> arestasEntrada;
	private ArrayList<Aresta<TIPO>> arestasSaida;

	public Vertice(TIPO valor) {
		this.dado = valor;
		this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
		this.arestasSaida = new ArrayList<Aresta<TIPO>>();
	}

	public TIPO getDado() {
		return dado;
	}

	public void setDado(TIPO dado) {
		this.dado = dado;
	}

	public ArrayList<Aresta<TIPO>> getArestasEntrada() {
		return arestasEntrada;
	}

	public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

	public ArrayList<Aresta<TIPO>> getArestasSaida() {
		return arestasSaida;
	}

	public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}

	public void adcionarArestaEntrada(Aresta<TIPO> aresta) {
		this.arestasEntrada.add(aresta);
	}

	public void adcionarArestaSaida(Aresta<TIPO> aresta) {
		this.arestasSaida.add(aresta);
	}

	public void setArestasEstrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

}
