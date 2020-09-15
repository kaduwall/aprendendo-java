package br.com.casadocodigo.livraria;

public class Autor {

    private String nome;
    private String email;
    private String cpf;

    public Autor(){

        /*if (nome == null) {
            System.out.println("Você não inseriu o nome de br.com.casadocodigo.livraria.Autor!");
        }*/

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {

        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("CPF: "+cpf);

    }



}


