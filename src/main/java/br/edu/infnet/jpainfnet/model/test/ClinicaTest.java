package br.edu.infnet.jpainfnet.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jpainfnet.AppPrinter;
import br.edu.infnet.jpainfnet.model.domain.Clinica;
import br.edu.infnet.jpainfnet.model.domain.Responsavel;
import br.edu.infnet.jpainfnet.model.exception.clinica.cnpjEmptyException;
import br.edu.infnet.jpainfnet.model.exception.clinica.cnpjNullException;
import br.edu.infnet.jpainfnet.model.service.ClinicaService;
import br.edu.infnet.jpainfnet.model.service.ResponsavelService;

@Component
@Order(4)
public class ClinicaTest implements ApplicationRunner {
    @Autowired
    ResponsavelService responsavelService;

    @Autowired
    ClinicaService clinicaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Responsavel responsavel1 = responsavelService.obterResponsavelById(1);

        System.out.println(responsavel1);

        try {
            Clinica ag1 = new Clinica("Clinica1", "12346789", "Rua A, 235, Centro", responsavel1);
            AppPrinter.imprimir("#Clinica1", ag1);
            clinicaService.addClinica(ag1);

        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag2 = new Clinica("Clinica2", "2312245", "Rua B, 3123, Centro", responsavel1);
            AppPrinter.imprimir("#Clinica2", ag2);
            clinicaService.addClinica(ag2);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag3 = new Clinica("Clinica3", "5122453", "Rua D, 3423, Centro", responsavel1);
            AppPrinter.imprimir("#Clinica3", ag3);
            clinicaService.addClinica(ag3);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag4 = new Clinica("Clinica4", "", "Rua D, 3423, Centro", responsavel1);
            AppPrinter.imprimir("#Clinica3", ag4);
            clinicaService.addClinica(ag4);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }

        try {
            Clinica ag5 = new Clinica("Clinica3", null, "Rua D, 3423, Centro", responsavel1);
            AppPrinter.imprimir("#Clinica3", ag5);
            clinicaService.addClinica(ag5);
        } catch (cnpjNullException exception) {
            System.err.println(exception);
        } catch (cnpjEmptyException emptyException) {
            System.err.println(emptyException);
        }
    }

}
