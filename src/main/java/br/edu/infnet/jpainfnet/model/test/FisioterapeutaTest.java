package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jpainfnet.AppPrinter;
import br.edu.infnet.jpainfnet.model.domain.Clinica;
import br.edu.infnet.jpainfnet.model.domain.Fisioterapeuta;
import br.edu.infnet.jpainfnet.model.service.ClinicaService;
import br.edu.infnet.jpainfnet.model.service.FisioterapeutaService;

@Component
@Order(5)
public class FisioterapeutaTest implements ApplicationRunner{
    @Autowired
    private FisioterapeutaService fisioterapeutaService;

    @Autowired
    private ClinicaService clinicaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Clinica clinica1 = clinicaService.obterClinica(1);

        Fisioterapeuta fisio1 = new Fisioterapeuta();
        fisio1.setNome("Rodrigo Siqueira");
        fisio1.setMatricula(3658);
        fisio1.setRegiaoCrefito("RJ 6");
        fisio1.setNumeroCrefito("96325");
        fisio1.setEspecialidades("Reabilitação, Torcicolo, Lordose");
        fisio1.setAtendeEmCasa(false);
        fisio1.setClinica(clinica1);
        AppPrinter.imprimir("Fisioterapeuta 1", fisio1);
        fisioterapeutaService.addFisioterapeuta(fisio1);

        Fisioterapeuta fisio2 = new Fisioterapeuta();
        fisio2.setNome("Pablo Silva");
        fisio2.setMatricula(3660);
        fisio2.setRegiaoCrefito("RJ 6");
        fisio2.setNumeroCrefito("96347");
        fisio2.setEspecialidades("Reabilitação, Torcicolo");
        fisio2.setAtendeEmCasa(true);
        fisio2.setClinica(clinica1);
        AppPrinter.imprimir("Fisioterapeuta 2", fisio2);
        fisioterapeutaService.addFisioterapeuta(fisio2);

        Fisioterapeuta fisio3 = new Fisioterapeuta();
        fisio3.setNome("Ricardo Amaro");
        fisio3.setMatricula(3675);
        fisio3.setRegiaoCrefito("RJ 6");
        fisio3.setNumeroCrefito("96418");
        fisio3.setEspecialidades("Torcicolp");
        fisio3.setAtendeEmCasa(true);
        fisio3.setClinica(clinica1);
        AppPrinter.imprimir("Fisioterapeuta 3", fisio3);
        fisioterapeutaService.addFisioterapeuta(fisio3);
    }
    
}
