package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;

@Entity
public class Psicologo extends Profissional{
    private String regiaoCrp;
    private String numeroCrp;
    private Boolean atendeRemoto;
    private int tempoSessao;

    public int getTempoSessao() {
        return tempoSessao;
    }

    public void setTempoSessao(int tempoSessao) {
        this.tempoSessao = tempoSessao;
    }

    public Boolean getAtendeRemoto() {
        return atendeRemoto;
    }

    public void setAtendeRemoto(Boolean atendeRemoto) {
        this.atendeRemoto = atendeRemoto;
    }

    public void setRegiaoCrp(String regiaoCrp) {
        this.regiaoCrp = "CRP " + regiaoCrp;
    }

    public void setNumeroCrp(String numeroCrp) {
        this.numeroCrp = numeroCrp;
    }

    @Override
    public void impressao() {
        System.out.println(this);     
        System.out.println(getConselhoRegional()); 
    }

    @Override
    public String getConselhoRegional() {
        return this.regiaoCrp + "/" + this.numeroCrp;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + atendeRemoto + ";" + tempoSessao;
    }
    
}
