package br.com.casadocodigo.livraria.executaveis;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class CadastroDeLivros {

    public static void main(String[] args) {




/*


        br.com.casadocodigo.livraria.produtos.Livro livro = new br.com.casadocodigo.livraria.produtos.Livro();
        // o 1o livro é o TIPO da var. é "TIPO nomedavar = new Classe();"
        // e que no caso a classe é o TIPO também

        // agora a var livro foi criada com o tipo da clase br.com.casadocodigo.livraria.produtos.Livro mas ela ainda n tem nenhum valor
        // pra adicionar valores vai assim:

        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        // e pra printar infos faz assim:

        System.out.println("");
        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);


        br.com.casadocodigo.livraria.produtos.Livro outroLivro = new br.com.casadocodigo.livraria.produtos.Livro();
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        System.out.println("");
        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);
*/

        Autor autor = new Autor(); //Qnd instanciamentos um objeto com NEW, ela guarda referências dos objetos e não somente valores.
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");

        LivroFisico livro = new LivroFisico(autor); // assim vamos conseguir criar o livro porque definimos o autor.
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos");
        livro.setValor(59.90);
        //livro.setIsbn("978-85-66250-46-6"); // Comentando pra deixar aparecer o valor default

        // método antigo: livro.autor = autor; // Associando esse autor ao primeiro livro
        //livro.setAutor(autor); // método com SETTER

        Autor outroAutor = new Autor();
        outroAutor.setNome("Kadu Wallauer");
        outroAutor.setEmail("kadu.w@live.com");
        outroAutor.setCpf("021.826.190-03");

        LivroFisico outroLivro = new LivroFisico(outroAutor); // Se colocar null rola um exception q fizemos na classe Livro
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        Autor terceiroAutor = new Autor();
        terceiroAutor.setNome("Marina Santiago");

        Ebook ebook = new Ebook(terceiroAutor);
        ebook.setValor(19.90);
        ebook.setNome("Java 8 Prático - br.com.casadocodigo.livraria.produtos.Ebook");

        LivroFisico livroFisico = new LivroFisico(terceiroAutor);
        livroFisico.setNome("Como cozinhar bem");
        livroFisico.setValor(49.90);

        //outroLivro.setAutor(outroAutor);

        //livro.valor -= livro.valor * 0.1; // 10% de desconto no primeiro livro ^^
        livro.aplicaDescontoDe(0.2); // otimizando
        livro.setValor(70); // Vai dizer q já existe um valor pra esse livro, de propósito

        ebook.aplicaDescontoDe(0.1);


        // Simplificamos os SOUT que estão comentados acima com uma função void
        // dentro da classe br.com.casadocodigo.livraria.produtos.Livro, daí a gente só chama ela aqui assim
        System.out.println("");
        livro.mostrarDetalhes();
        outroLivro.mostrarDetalhes();
        ebook.mostrarDetalhes();
        livroFisico.mostrarDetalhes();

/*

        Autor autor2 = new Autor();
        autor.setNome("Eduardo");

        Autor autor3 = new Autor();
        autor.setNome("Eduardo");

        if (autor2 == autor3) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente"); // Vai dar isso pq a comparação é o objeto, não o valor
        }

        if (autor2.equals(autor3)) {
            System.out.println("Igual2");
        } else {
            System.out.println("Diferente2"); // Ainda vai dar false, é basicamente a msm coisa q fazer ==
        }
*/
        /* A vantagem do equals é q daria pra sobrescrever o metódio na classe Autor lá por exemplo

        Assim:

        @Override
        public boolean equals(Object obj) {
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
        } // isso sim definiria que qnd os 2 autores tiverem o msm nome resultaria true, msm sendo objetos diferentes
        // Mas tem grandes chances de dar Exception caso n passem um Autor pro equals


        // getClass e hashcode são outros métodos da classe Object

        // Object objeto = new Integer(10); // utiliza um Wrapper pra transformar o numero em int
        // Object objeto = 10; // deps do Java 1.5 por padrão o número é int em princípio pelo q entendi

        Tipo e Wrapper (class)

        boolean / Boolean          .parseBoolean("false") transformaria a string false em booleano
        byte / Byte      .parseByte
        short / Short
        char / Character
        int / Integer
        float / Float
        long / Long
        double / Double

        para transformar os valores em string seria String.valueOf(10);

        - se tentar transformar uma string de caracteres tipo ABC num Int vai dar uma exception

        - Essas classes tipo Object, String, System e wrappers nunca precisam de um import pq
        já estão no pacote padrão do Java, o java.lang

        Existem várias outras classes úteis lá, como o Math.round/max/min/abs/sqrt

        https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        Outra classe útil: Random

        Random random = new Random();
        sout(random.nextInt(10)); faria um número int aleatório de 1 a 10
        tbm tem pra nextBoolean, nextDouble, etc

        // STRINGS SÃO IMUTÁVEIS
        pra "mudar" precisaria pegar outra String

        String java = "java";
        java.replace("v", "c"); // n mudaria

        teria que ser
        String novaString = java.replace("v", "c");
        sout(novaString);

        outros métodos são:

        String ||| .toUpperCase();
        String ||| .toLowerCase();
        char ||| .charAt(0);
        boolean ||| .endsWith("a");
        boolean ||| .startsWith("s");
        boolean ||| .equalsIgnoreCase("JAVA");

        http://docs.oracle.com/javase/8/docs/api/java/lang/package-summary

         */

        List<Livro> livros = Arrays.asList(livro, outroLivro, livroFisico, ebook);
/*
        Collections.sort(livros, new Comparator<Livro>() { // Classe anônima
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });

        // Outro jeito de fazer isso melhor deps do Java 8:

        livros.sort(new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });

        // Dá pra ficar melhor ainda utilizando uma EXPRESSÃO LAMBDA:

        livros.sort((Livro l1, Livro l2) -> {
                return l1.getNome().compareTo(l2.getNome());
        });

        /// SIMPLIFICANDO MAIS AINDA o código:

        livros.sort(
                (l1, l2) -> l1.getNome().compareTo(l2.getNome())
        );
*/
        /* ^ o código acima resulta em uma instância de Comparator. Não há necessidade
        de declarar o tipo (Livro) dos parâmetros, o compilador já infere. Não há necessidade
        da palavra return e nem de chaves {}, já que temos uma única instrução após o operador ->

        E dá pra tornar ele ainda mais enxuto (!) usando o método default comparing.
        Ele é uma fábrica (factory) de Comparator.
        */

        livros.sort(comparing(l -> l.getNome()));

        /* Também poderia fazer: livros.sort(comparing(Livro::getNome));
         ^ isso é conhecido como method reference.

        //////// Print

        for (Livro teste : livros) { // enhanced-for
            System.out.println(teste.getNome());
        }

        ^ No java 8 dá pra otimizar e usar um forEach, ficando assim:
        */

        livros.forEach(l -> System.out.println(l.getNome())); // para cada livro chame o método println pegando o nome


        // COMO CRIAR UMA STREAM pra organizar e printar elementos

        Stream<Livro> steam = livros.stream();

        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println("stream "+l.getNome()));

        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        // https://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
        // http://www.casadocodigo.com.br/products/livro-java8

    }
}
