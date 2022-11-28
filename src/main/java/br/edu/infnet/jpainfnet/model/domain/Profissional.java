package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import br.edu.infnet.jpainfnet.model.interfaces.IPrinter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Profissional implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    protected String nome;
    protected int matricula;
    protected String especialidades;

    @ManyToOne
    protected Clinica clinica;

    public abstract String getConselhoRegional();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    @Override
    public String toString() {
        return nome + ";" + matricula + ";" + especialidades + ";" + getConselhoRegional();
    }

}
