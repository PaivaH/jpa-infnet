package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;

@Entity
public class Nutricionista extends Profissional{
    private String regiaoCrn;
    private String numeroCrn;
    private Boolean esportivo;

    public Boolean getEsportivo() {
        return esportivo;
    }

    public void setEsportivo(Boolean esportivo) {
        this.esportivo = esportivo;
    }

    @Override
    public void impressao() {
        System.out.println(this);        
    }

    public void setRegiaoCrn(String regiaoCrn) {
        this.regiaoCrn = "CRN " + regiaoCrn;
    }

    public void setNumeroCrn(String numeroCrn) {
        this.numeroCrn = numeroCrn;
    }

    @Override
    public String getConselhoRegional() {
        return this.regiaoCrn + "/" + this.numeroCrn;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + esportivo;
    }
}
