package br.com.casadocodigo.livraria.executaveis;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    /* poderíamos fazer isso:
    private Produto produto1;
    private Produto produto2;
    Mas vamos fazer isso aqui com array: */
    //private Produto[] produtos = new Produto[10]; // poderia receber a quantidade no construtor da classe
    // ou num método setProdutos, mas por enquanto vamos determinar o número aqui mesmo, 10
    //private Object[] objects = new Object[10]; // Poderia ser assim mas não costuma ser uma boa alternativa

    //private Produto[] produtos;
    private List<Produto> produtos; ///////////// ARRAY LIST da API de Collections, melhor do que array
    // Utilizar LIST invés de ArrayList aqui torna o código + flexível, daí pode usar ou LinkedList ou ArrayList a qualquer momento mudando só o "new"

    //private int contador = 0;

    public CarrinhoDeCompras() { //invocando construtor com a necessidade de passar o produto como um arg de array
        //this.produtos = produtos;

        this.produtos = new ArrayList<Produto>(); // diamond operator

    }



    /* ArrayList é mais rápida para fazer pesquisas (ITERAR)
     LinkedList é mais rápida para inserir e remover elementos de suas pontas.
     As duas tem em comum a interface List, do pacote java.util
     Para não deixar nosso código dependendo de um tipo de lista específica (acoplamento)
     já que podemos a qualquer momento mudá-las, é uma boa prática programar voltado
     para a interface List.

     */





    //public void adiciona(Object object)

    public void adiciona(Produto produto) {
        //System.out.println("Adicionando: " + produto); // fully qualified name
        //System.out.println("Adicionando: " + produto.toString()); // ^ mesma coisa

        /*System.out.println("Adicionando: " + produto.getNome()); // nome de fato
        this.produtos[contador] = produto;
        contador++;*/

        //Produto moldado = (Produto) object;
        //this.total += moldado.getValor(); // Assim
        //this.total += object.getValor(); // ^ poderia resolver com um casting

        // double valor = ((Produto)object).getValor(); // casting em linha única

        this.total += produto.getValor();

        this.produtos.add(produto); //não precisa mais do contador e tudo mais por ter a ArrayList!

    }

    public void remove(int posicao) {
        // this.total -= produtos(posicao).getValor(); Como fazer isso?
        this.produtos.remove(posicao);

    }


    // Invés de usar Produto no polimorfismo, poderia user Object, toda classe em Java é um Object, sem exceção
/*
    public void adiciona(Produto produto) { // Polimorfismo, aceita todos da classe pai
        //br.com.casadocodigo.livraria.produtos.Ebook ebook = (br.com.casadocodigo.livraria.produtos.Ebook) livro; // Isso é um casting, pra poder pegar a função do ebook
        //ebook.getWaterMark(); // Mas deixaria de ser vantagem usar polimorfismo

        System.out.println("Adicionando: "+produto.getNome());
        //produto.aplicaDescontoDe(0.05);
        this.produtos[contador] = produto;
        contador ++;
        total += produto.getValor();

        // o método de desconto aplicado sempre vai ter prioridade o da classe e não da classe pai

    }*/

    public double getTotal() {
        return total;
    }

    /*public Object[] getProdutos() {
        return objects;
    }*/


    //public Produto[] getProdutos() {
    public List<Produto> getProdutos() {
        return produtos;
    }

}
