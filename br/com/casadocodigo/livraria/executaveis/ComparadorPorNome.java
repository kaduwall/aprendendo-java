package br.com.casadocodigo.livraria.executaveis;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparadorPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getNome().compareTo(l2.getNome());
    }


    public static void main(String[] args) {

        // Toda essa classe aqui seria um método antigo de usar o Collections pra ordenar livros por nome

        Autor autor = new Autor();
        autor.setNome("Kadu");

        Livro java = new LivroFisico(autor);
        java.setNome("Java 8");

        Livro mamao = new LivroFisico(autor);
        mamao.setNome("Mamão com Açúcar");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(mamao, java, ruby);

        Collections.sort(livros, new ComparadorPorNome());

        for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }

    }
}
