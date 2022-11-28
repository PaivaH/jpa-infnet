package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;

@Entity
public class Fisioterapeuta extends Profissional{
    private String regiaoCrefito;
    private String numeroCrefito;
    private Boolean atendeEmCasa;

    public Boolean getAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(Boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }

    public void setRegiaoCrefito(String regiaoCrefito) {
        this.regiaoCrefito = "CREFITO " + regiaoCrefito;
    }

    public void setNumeroCrefito(String numeroCrefito) {
        this.numeroCrefito = numeroCrefito;
    }

    @Override
    public void impressao() {
        System.out.println(this);        
    }

    @Override
    public String getConselhoRegional() {
        return this.regiaoCrefito + "/" + this.numeroCrefito;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + atendeEmCasa;
    }
        
}
