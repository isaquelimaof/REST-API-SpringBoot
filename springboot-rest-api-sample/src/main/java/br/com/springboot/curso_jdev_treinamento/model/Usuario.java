package br.com.springboot.curso_jdev_treinamento.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


//@Entity é uma anotação do JPA que identifica a classe sendo uma entity
// ao realizar a persistência na base de dados assim criando uma tabela com as instâncias da classe
@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;
	@Column
	private ArrayList<UsuarioList> nomeDate;
	
	public Long getId() {
		return id;
	}
	
	public ArrayList<UsuarioList> getNomeDate() {
		return nomeDate;
	}
	
	
	
	
	

}
