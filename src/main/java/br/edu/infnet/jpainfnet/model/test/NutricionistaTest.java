package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jpainfnet.AppPrinter;
import br.edu.infnet.jpainfnet.model.domain.Clinica;
import br.edu.infnet.jpainfnet.model.domain.Nutricionista;
import br.edu.infnet.jpainfnet.model.service.ClinicaService;
import br.edu.infnet.jpainfnet.model.service.NutricionistaService;

@Component
@Order(5)
public class NutricionistaTest implements ApplicationRunner {
    @Autowired
    NutricionistaService nutricionistaService;

    @Autowired
    ClinicaService clinicaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Clinica clinica2 = clinicaService.obterClinica(2);

        Nutricionista nutri1 = new Nutricionista();
        nutri1.setNome("Cristina Nogueira");
        nutri1.setMatricula(864);
        nutri1.setEsportivo(false);
        nutri1.setEspecialidades("Emagrecimento");
        nutri1.setRegiaoCrn("SP 9");
        nutri1.setNumeroCrn("568314");
        nutri1.setClinica(clinica2);
        AppPrinter.imprimir("Nutricionista 1", nutri1);
        nutricionistaService.addNutricionista(nutri1);

        Nutricionista nutri2 = new Nutricionista();
        nutri2.setNome("Andressa Brito");
        nutri2.setMatricula(142);
        nutri2.setEsportivo(true);
        nutri2.setEspecialidades("Emagrecimento");
        nutri2.setRegiaoCrn("SP 9");
        nutri2.setNumeroCrn("55646");
        nutri2.setClinica(clinica2);
        AppPrinter.imprimir("Nutricionista 2", nutri2);
        nutricionistaService.addNutricionista(nutri2);

        Nutricionista nutri3 = new Nutricionista();
        nutri3.setNome("Miguel do Santos");
        nutri3.setMatricula(1245);
        nutri3.setEsportivo(true);
        nutri3.setEspecialidades("Emagrecimento");
        nutri3.setRegiaoCrn("SP 9");
        nutri3.setNumeroCrn("542415");
        nutri3.setClinica(clinica2);
        AppPrinter.imprimir("Nutricionista 3", nutri3);
        nutricionistaService.addNutricionista(nutri3);
    }

}
