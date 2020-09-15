package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto> { // Nem sempre o uso da herança é legal porque força as subclasses
    // a se comportarem de um determinado jeito. Fica difícil evoluir o código.
    // Pra isso serve a interface, que permite o polimorfismo mas não restringe as subclasses

    double getValor(); // toda classe q implementar a interface br.com.casadocodigo.livraria.produtos.Produto agora
    // precisará ter essa função ou não vai compilar

    String getNome();



    // o Extend de Comparable é pra poder ordenar coisas
    // Daí tem que adicionar as funções de compareTo nas classes
}
