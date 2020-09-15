package br.com.casadocodigo.livraria.produtos;//
// COMEÇO DA ORIENTAÇÃO A OBJETOS
//

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.AutorNuloException;

public abstract class Livro implements Produto { // molde, agora com o abstract isso impede que a classe seja usada sem uma subclasse / extended
// ela ainda pode - e muitas vezes deve - ser usada como referência na criação dos objetos


    // O recomendado é que os atributo de classe deve ser sempre private, pra evitar que
    // alguém os acesse diretamente e viole as regras do negócio/código
    // Então a gente esconde os atributos com private e encapsula eles em métodos
    // termômetro pra ver se o código está bem encapsulado:
    // - O que esse código faz?
    // - Como esse código faz?
    // Em um código bem encapsulado você só deveria conseguir responder a primeira pergunta.
    // Isso deixa o código mt mais passível de mudanças / manutenibilidade
    // NEM TODOS ATRIBUTOS PRECISAM DE UM SETTER / GETTER.

    private String nome;
    private String descricao;
    private double valor; // pra impedir que o user altere o valor fora da função designada pra isso
    private String isbn; // standard book number, é um ID
    private Autor autor;
    private byte count;
    //private br.com.casadocodigo.livraria.produtos.LivroFisico livroFisico;

    public Livro(Autor autor) { // Agora é obrigatorio colocar um Autor no livro
        this(); // pra chamar o public Livro() ali tbm
        if (autor == null) {
            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
        }
        this.autor = autor;
        System.out.println("Novo livro criado!");
    }

    public Livro() { // método público, comumente chamado de interface da classe / construtor
        this.isbn = "000-00-00000-00-0"; // Valor default caso o usuario n insira nada no ISBN
    } // Isso é só pra mostrar que a classe pode ter mais de um construtor desde q n seja os mesmos argumentos


    public void setValor(double valor) { // isso é um SETTER
        if (this.count == 0) {
            this.valor = valor;
            this.count++; // Permite que o user adicione um valor para um livro que ainda n tem
        } else {
            System.out.println("Já existe um valor para o livro "+this.nome+"!");
        }
    }

   public double getValor() { // isso é um GETTER, página 63
        return this.valor;
   }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public byte getCount() {
        return count;
    }

    public void setCount(byte count) {
        this.count = count;
    }

    // Existem alguns atalhos, no Eclipse é Ctrl + 3 e dps digita ggas pra "Generate Gets and Setters"
    // No IntelliJ é Alt + Insert e daí seleciona o q quer


    // Esse mostrarDetalhes poderia sumir e entrar o void toString() que é o padrão no lugar
    // inclusive seria melhor

    public void mostrarDetalhes() { // void representa ausência de retorno

        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);

        if (this instanceof LivroFisico) { // Outro método if (a.getClass() == X.class) {
            LivroFisico livroFisico = (LivroFisico) this; //casting

            System.out.printf("Taxa de impressão: %.2f %n", livroFisico.getTaxaImpressao());
            // ^ limita em 2 decimais depois do . e quebra pra uma nova linha

            //System.out.println("rolou");
        }

        if (this.temAutor()) { // Agora se n tiver autor ele n mostra os dados
            System.out.println("");
            autor.mostrarDetalhes();
        }

        System.out.println("--");

    }

    //public abstract boolean aplicaDescontoDe(double porcentagem); // isso faz com que as classes que não definerem o seu aplicaDescontoDe não compilem, tornando-o obrigatório
    // mudamos pra utilização de uma interface, daí o que eu quiser q tenha desconto vai usar ela

    boolean temAutor(){  // função pra ver se existe autor
        return this.autor != null;
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

        //return this.getValor() - outro.getValor();
        // também poderíamos usar o Integer.compare

    }




}









