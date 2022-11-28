package br.edu.infnet.jpainfnet.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.jpainfnet.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    @Query("from Usuario u where u.email = :email")
    Usuario findByEmail(String email);
}
