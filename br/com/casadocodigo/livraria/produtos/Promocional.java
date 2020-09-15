package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {

    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento() { // com o default ele deixa implementar método (Java 8+)
        return aplicaDescontoDe(0.1);
    }


    // Interfaces com um único método abstrato são chamadas de Interfaces Funcionais, como essa.

    // métodos não podem acessar atributos de instância, não há herança múltipla ou compartilhamento de estado

}
