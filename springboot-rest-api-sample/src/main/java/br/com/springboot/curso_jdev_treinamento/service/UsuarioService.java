package br.com.springboot.curso_jdev_treinamento.service;

import br.com.springboot.curso_jdev_treinamento.model.Usuario;

public interface UsuarioService {
	
	
	/**
	 * @param usuario
	 * @return usuário a ser salvo na base de dados
	 */
	Usuario salvarUsuario(Usuario usuario);

}
