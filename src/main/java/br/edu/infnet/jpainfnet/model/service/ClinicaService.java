package br.edu.infnet.jpainfnet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jpainfnet.model.domain.Clinica;
import br.edu.infnet.jpainfnet.model.repository.ClinicaRepository;

@Service
public class ClinicaService {
    
    @Autowired
    private ClinicaRepository clinicaRepository;

    public void addClinica(Clinica clinica){
        clinicaRepository.save(clinica);
    }

    public Iterable<Clinica> obterClinicas() {
        return clinicaRepository.findAll();
    }

    public Iterable<Clinica> obterClinicasPorUsuario(Integer id) {
        return clinicaRepository.obterClinicasPorId(id);
    }

    public Clinica obterClinica(Integer id){
        return clinicaRepository.findById(id).get();
    }

    public void excluir(Integer id) {
        clinicaRepository.deleteById(id);
    }
}
