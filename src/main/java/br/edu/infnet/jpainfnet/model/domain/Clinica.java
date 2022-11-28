package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.edu.infnet.jpainfnet.model.exception.clinica.cnpjEmptyException;
import br.edu.infnet.jpainfnet.model.exception.clinica.cnpjNullException;
import br.edu.infnet.jpainfnet.model.interfaces.IPrinter;

@Entity
public class Clinica implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cnpj;
    private String endereco;

    @ManyToOne
    private Responsavel responsavel;

    public Clinica() {
    }

    public Clinica(String nome, String cnpj, String endereco,
            Responsavel responsavel) throws cnpjEmptyException, cnpjNullException {

        if (cnpj == null) {
            throw new cnpjNullException("CNPJ não pode ser nulo");
        }
        if (cnpj.isEmpty()) {
            throw new cnpjEmptyException("CNPJ não pode estar vazio");
        }
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.responsavel = responsavel;
    }



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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return nome + ";" + cnpj + ";" + endereco + ";";
    }

    @Override
    public void impressao() {
        System.out.println(this);

    }
}
