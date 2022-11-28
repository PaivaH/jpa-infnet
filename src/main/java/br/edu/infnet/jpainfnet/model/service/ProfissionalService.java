package br.edu.infnet.jpainfnet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jpainfnet.model.domain.Profissional;
import br.edu.infnet.jpainfnet.model.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
    @Autowired
    ProfissionalRepository profissionalRepository;

    public void addProfissional(Profissional profissional) {
        profissionalRepository.save(profissional);
    }

    public Iterable<Profissional> obterProfissionais() {
        return profissionalRepository.findAll();
    }

    public Iterable<Profissional> obterProfissionaisPorUsuario(Integer id) {
        return profissionalRepository.obterProfissionaisPorUsuario(id);
    }

    public void excluir(Integer id) {
        profissionalRepository.deleteById(id);
    }
}
