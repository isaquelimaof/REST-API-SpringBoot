//package br.com.springboot.curso_jdev_treinamento.service;
//
//import org.springframework.stereotype.Service;
//
//import br.com.springboot.curso_jdev_treinamento.model.Usuario;
//import br.com.springboot.curso_jdev_treinamento.repository.UsuarioRepository;
//
//@Service
//public class UsuarioServiceImpl implements UsuarioService {
//	
//
//	private UsuarioRepository usuarioRepository;
//	
//	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
//		this.usuarioRepository = usuarioRepository;
//	}
//
//	@Override
//	public Usuario salvarUsuario(Usuario usuario) {
//		Usuario salvaNaBaseDeDados = usuarioRepository.save(usuario);
//		return salvaNaBaseDeDados;
//	}
//
//}
