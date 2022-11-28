package br.edu.infnet.jpainfnet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jpainfnet.model.domain.Usuario;
import br.edu.infnet.jpainfnet.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario validar(String email, String senha) {
        Usuario usuario = null;

        try {
            usuario = usuarioRepository.findByEmail(email);
            if (senha != null && senha.equals(usuario.getSenha())) {
                return usuario;
            }
        } catch (Exception exception) {
            exception.getMessage();
        }

        return null;
    }

    public Iterable<Usuario> obterUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obterUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
