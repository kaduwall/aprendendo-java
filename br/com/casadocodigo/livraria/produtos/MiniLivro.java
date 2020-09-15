package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    /*@Override // Apagamentos porque agora temos a interface br.com.casadocodigo.livraria.produtos.Promocional
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }*/

}
