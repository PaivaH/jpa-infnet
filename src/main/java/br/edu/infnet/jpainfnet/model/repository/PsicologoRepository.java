package br.edu.infnet.jpainfnet.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.jpainfnet.model.domain.Psicologo;

public interface PsicologoRepository extends CrudRepository <Psicologo, Integer>{
    
    @Query("from Psicologo p where p.clinica.responsavel.usuario.id = :id")
    Iterable<Psicologo> obterProfissionaisPorUsuario(Integer id);
}
