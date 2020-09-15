package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;
    private byte count;

    // getters and setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) { // isso é um SETTER
        if (this.count == 0) {
            this.valor = valor;
            this.count++; // Permite que o user adicione um valor para uma revista que ainda n tem
        } else {
            System.out.println("Já existe um valor para a revista "+this.nome+"!");
        }
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public byte getCount() {
        return count;
    }

    public void setCount(byte count) {
        this.count = count;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) { // Se alguém tentar colocar o desconto maior que 30% ele não deixa
            System.out.println("Desconto não pode ser maior do que 10%!");
            return false;
        } else {
            this.setCount((byte) 0);
            double desconto = this.getValor() * porcentagem;
            this.setValor(this.getValor() - desconto);
            System.out.println("Aplicando desconto na revista " + this.getNome());
            return true;
        }
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;

    }


}
