package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jpainfnet.model.domain.Usuario;
import br.edu.infnet.jpainfnet.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioTest implements ApplicationRunner{
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Usuario usuario = new Usuario();
        usuario.setNome("Admin");
        usuario.setEmail("admin@admin.com");
        usuario.setSenha("123");
        usuario.setAdmin(true);

        usuarioService.incluir(usuario);
    }
    
}
