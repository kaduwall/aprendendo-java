package br.com.casadocodigo.livraria.executaveis;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

import java.util.*;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor de "+ fisico.getNome() + " agora é " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development - br.com.casadocodigo.livraria.produtos.Ebook");
        ebook.setValor(29.90);

        Revista revista = new Revista();
        revista.setNome("Revistinha da Mônica");
        revista.setValor(19.90);


        /*ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto buscado = produtos.get(0);
        produtos.add("Eu não sou um produto"); // erro de compiler de propósito */


        /*ArrayList lista = new ArrayList(); // Array list trabalha com Object
        String valor = "conhecendo uma ArrayList";
        lista.add(valor);
        System.out.println(lista.contains(valor)); //retorna true
        lista.remove(valor);
        System.out.println(lista.contains(valor)); //retorna false
        */




        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        carrinho.adiciona(revista);






        List<Produto> produtos = carrinho.getProdutos(); // "TIPO[] var = carrinho.método", sendo que o carrinho
        // é um objeto q foi criado logo acima com a classe do CarrinhoDeCompras
        // resumindo, pega os produtos do carrinho de compras :S

        for (Produto produto : produtos) { // Enhanced-for
            if (produto != null) {
                //System.out.println(produto.getValor());
                System.out.println(produto);
            }
        }

        System.out.printf("Total: %.2f %n", carrinho.getTotal());
        //System.out.println("Total com desconto de 5%: "+carrinho.getTotal());

        /*
        O código do "for" em cima é melhor e é mais ou menos o mesmo que isso:

        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];
            if (produto != null) {
                System.out.println(produto.getValor());
            }
        }

        */

        // Exemplo de organização de nomes para ordem alfabética:

        List<String> nomes = new ArrayList<>();
        nomes.add("Kadu Wallauer");
        nomes.add("Adalberto Alberto");
        nomes.add("Marina Borges");

        Collections.sort(nomes); // Essa classe de Collections tem bastante coisa legal
        // Outros exemp,los são o: reverse (para inverter a ordem dos elementos da lista
        // o copy, para copiar os elementos de uma lista para outra
        // o emptyList, que retornará uma lista vazia
        // mais aqui: https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html

        System.out.println(nomes);

        // ELEMENTOS ORDENÁVEIS devem sempre implementar a interface java.lang.Comparable
        // que possui o método compareTo


        // Como adicionamos override no Livro e Revista e colocamos o compareTo de menor pra maior
        // daí é possível fazer isso:
        List<Produto> produtos2 = Arrays.asList(fisico, ebook);
        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }







    }

}
