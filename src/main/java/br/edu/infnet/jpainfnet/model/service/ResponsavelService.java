package br.edu.infnet.jpainfnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jpainfnet.model.domain.Responsavel;
import br.edu.infnet.jpainfnet.model.repository.ResponsavelRepository;

@Service
public class ResponsavelService {

    @Autowired
    ResponsavelRepository responsavelRepository;

    public void addResponsavel(Responsavel responsavel) {
        responsavelRepository.save(responsavel);
    }

    public Responsavel obterResponsavelById(Integer id){
        return responsavelRepository.findById(id).get();
    }

    public List<Responsavel> obterResponsaveisPorUsuario(Integer id){
        return responsavelRepository.obterResponsaveis(id);
    }

    public Iterable<Responsavel> obterResponsaveis() {
        return responsavelRepository.findAll();
    }

    public void excluir(Integer id) {
        responsavelRepository.deleteById(id);
    }
}
