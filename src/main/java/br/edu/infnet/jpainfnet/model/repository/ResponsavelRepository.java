package br.edu.infnet.jpainfnet.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.jpainfnet.model.domain.Responsavel;

public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> {

    @Query("select r from Responsavel r where r.usuario.id = :id")
    List<Responsavel> obterResponsaveis(Integer id);
}
