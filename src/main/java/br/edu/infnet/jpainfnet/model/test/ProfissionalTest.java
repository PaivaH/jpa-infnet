package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.jpainfnet.AppPrinter;
import br.edu.infnet.jpainfnet.model.domain.Fisioterapeuta;
import br.edu.infnet.jpainfnet.model.domain.Nutricionista;
import br.edu.infnet.jpainfnet.model.domain.Profissional;
import br.edu.infnet.jpainfnet.model.domain.Psicologo;
import br.edu.infnet.jpainfnet.model.service.ProfissionalService;

public class ProfissionalTest implements ApplicationRunner {
    @Autowired
    ProfissionalService profissionalService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Profissional fisio1 = new Fisioterapeuta();
        fisio1.setNome("Rodrigo");
        fisio1.setMatricula(3658);
        fisio1.setEspecialidades("Reabilitação, Torcicolo, Lordose");
        AppPrinter.imprimir("Fisioterapeuta 1", fisio1);
        profissionalService.addProfissional(fisio1);

        Profissional nutri1 = new Nutricionista();
        nutri1.setNome("Cristina");
        nutri1.setMatricula(864);
        nutri1.setEspecialidades("Emagrecimento");
        AppPrinter.imprimir("Nutricionista 1", nutri1);
        profissionalService.addProfissional(nutri1);

        Profissional ps1 = new Psicologo();
        ps1.setNome("Patricia");
        ps1.setEspecialidades("Infantil");
        ps1.setMatricula(1223);
        ps1.getConselhoRegional();
        AppPrinter.imprimir("Psicologo", ps1);
        profissionalService.addProfissional(ps1);
    }

}
