package br.com.springboot.curso_jdev_treinamento.model;

import java.io.Serializable;


public class UsuarioList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String source;
	private String target;
	private int distance;
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	

}
