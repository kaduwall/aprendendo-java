package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional { // pega todos atributos da classe br.com.casadocodigo.livraria.produtos.Livro pq um br.com.casadocodigo.livraria.produtos.Ebook é um tipo de livro
// Tudo que a classe br.com.casadocodigo.livraria.produtos.Livro tem de atributos E métodos, a br.com.casadocodigo.livraria.produtos.Ebook tbm vai ter.

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor); // repassa a responsabilidade pra superclasse que já tem esse comportamento definido
    }



    public String getWaterMark() { // getter e setter pro watermark
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override // isso é apenas uma marcação, tipo um post-it, pra mostrar que essa função tá passando por cima de
    // uma função que já existe na classe br.com.casadocodigo.livraria.produtos.Livro, é facultativo mas ajuda o compilador
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) { // Se alguém tentar colocar o desconto maior que 30% ele não deixa
            System.out.println("Desconto não pode ser maior do que 30%!");
            return false;
        } else {
            this.setCount((byte) 0);
            double desconto = this.getValor() * porcentagem;
            this.setValor(this.getValor() - desconto);
            System.out.println("Aplicando desconto no livro " + this.getNome());
            return true;
        }
    }


        /*if (porcentagem > 0.15) { // Se alguém tentar colocar o desconto maior que 15% ele não deixa
            System.out.println("Desconto não pode ser maior do que 15%!");
            return false;
        }

            this.setCount((byte)0);
            double desconto = this.getValor() * porcentagem;
            this.setValor(this.getValor() - desconto);
            System.out.println("Desconto aplicado no livro "+this.getNome()+"!");
            return true;*/
            // return super.aplicaDescontoDe(porcentagem); // dá pra reduzir o código comentado acima a isso!
            // daí termina de chamar a função da própria classe br.com.casadocodigo.livraria.produtos.Livro!

 /*
    @Override
    public String toString() {
        return "Eu sou um Ebook"; // mudando a saída padrão da classe Ebook
    }
*/
}
