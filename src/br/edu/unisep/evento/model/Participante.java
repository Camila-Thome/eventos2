package br.edu.unisep.evento.model;

public class Participante {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String rg;

    public Participante() {
    }

    public Participante(int id, String nome, String email, String telefone, String cpf, String rg) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + "\n" + "nome='" + nome + '\'' + "\n" + "email='" + email + '\'' + "\n" + "telefone='" + telefone + '\'' + "\n" + "cpf='" + cpf + '\'' + "\n" + "rg='" + rg + '\'' + "\n" + '}';
    }
}
