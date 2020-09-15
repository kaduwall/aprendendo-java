package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    // Não tem problema criar uma classe pra cada tipo de objeto, pelo contrário, é preferível

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
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


}
