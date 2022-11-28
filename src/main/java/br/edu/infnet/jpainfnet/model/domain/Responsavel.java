package br.edu.infnet.jpainfnet.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.edu.infnet.jpainfnet.model.exception.responsavel.nameEmptyException;
import br.edu.infnet.jpainfnet.model.exception.responsavel.nameNullException;
import br.edu.infnet.jpainfnet.model.interfaces.IPrinter;

@Entity
public class Responsavel implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cargo;
    private String email;

    @ManyToOne
    private Usuario usuario;

    public Responsavel() {
    }

    public Responsavel(String nome, String cargo, String email, Usuario usuario)
            throws nameNullException, nameEmptyException {
        if (nome == null) {
            throw new nameNullException("Nome não pode ser nulo!");
        }
        if (nome.isBlank()) {
            throw new nameEmptyException("Nome não pode estar em branco!");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.usuario = usuario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return nome + ";" + cargo + ";" + email + ";";
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
