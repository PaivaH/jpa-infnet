package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jpainfnet.AppPrinter;
import br.edu.infnet.jpainfnet.model.domain.Clinica;
import br.edu.infnet.jpainfnet.model.domain.Psicologo;
import br.edu.infnet.jpainfnet.model.service.ClinicaService;
import br.edu.infnet.jpainfnet.model.service.PsicologoService;

@Component
@Order(5)
public class PsicologoTest implements ApplicationRunner {
    @Autowired
    PsicologoService psicologoService;

    @Autowired
    ClinicaService clinicaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Clinica clinica2 = clinicaService.obterClinica(2);

        Psicologo ps1 = new Psicologo();
        ps1.setNome("Patricia Pilares");
        ps1.setTempoSessao(50);
        ps1.setEspecialidades("Infantil");
        ps1.setMatricula(1223);
        ps1.setRegiaoCrp("RJ2");
        ps1.setNumeroCrp("4792");
        ps1.setAtendeRemoto(true);
        ps1.getConselhoRegional();
        ps1.setClinica(clinica2);
        AppPrinter.imprimir("Psicologo", ps1);
        psicologoService.addPsicologo(ps1);

        Psicologo ps2 = new Psicologo();
        ps2.setNome("Dante Nogueira");
        ps2.setTempoSessao(55);
        ps2.setEspecialidades("Infantil");
        ps2.setMatricula(5151);
        ps2.setRegiaoCrp("RJ2");
        ps2.setNumeroCrp("4152");
        ps2.setAtendeRemoto(true);
        ps2.getConselhoRegional();
        ps2.setClinica(clinica2);
        AppPrinter.imprimir("Psicologo", ps2);
        psicologoService.addPsicologo(ps2);

        Psicologo ps3 = new Psicologo();
        ps3.setNome("Caio Gomes");
        ps3.setTempoSessao(50);
        ps3.setEspecialidades("Infantil");
        ps3.setMatricula(1223);
        ps3.setRegiaoCrp("RJ2");
        ps3.setNumeroCrp("4125");
        ps2.setAtendeRemoto(false);
        ps3.getConselhoRegional();
        ps3.setClinica(clinica2);
        AppPrinter.imprimir("Psicologo", ps3);
        psicologoService.addPsicologo(ps3);
    }

}
