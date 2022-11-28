package br.edu.infnet.jpainfnet.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.jpainfnet.model.domain.Clinica;

public interface ClinicaRepository extends CrudRepository<Clinica, Integer>{
    
    @Query("from Clinica c where c.responsavel.usuario.id = :id")
    Iterable<Clinica> obterClinicasPorId(Integer id);
}
