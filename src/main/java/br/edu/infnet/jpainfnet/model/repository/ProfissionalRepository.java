package br.edu.infnet.jpainfnet.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.jpainfnet.model.domain.Profissional;

public interface ProfissionalRepository extends CrudRepository<Profissional, Integer>{
    
    @Query("from Profissional p where p.clinica.responsavel.usuario.id = :id")
    Iterable<Profissional> obterProfissionaisPorUsuario(Integer id);
}
