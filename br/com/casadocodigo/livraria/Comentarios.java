package br.com.casadocodigo.livraria;

public class Comentarios {




    /*

    > Fiz essa classe específica para anotações.


    - Pra chamar a classe Date de Java por nome completo seria java.util.Date date = new java.util.date();
    - ^ fully qualified name

    - O nome do pacote aonde se encontra a classe date é java.util

    - Algumas classes como a String e System não precisam ser escritas com o nome completo
    pois fazem parte do pacote java.lang, que é o pacote padrão do Java.

    - API: Application Programming Interface
    ^ conjunto de rotinas e padrões de prog. para acersso a um aplicativo de software ou plataforma web

    - só será necessário escrever o nome completo da classe sem um "import" se
    por alguma razão você precisar usar duas classes com o mesmo nome dentro do mesmo arquivo.
    Nesse caso poderia fazer import de uma delas e utilizar o nome completo qnd for se referir à outra.

    - Quando a classe criada está no diretório src, ela não tem um pacote definido.
    Dizemos que ela está no default package. E isso não é bom. Toda classe deve ser agrupada em pacotes.
    Isso além de ajudar na organização, ajudará quando houver ambiguidade de nomes.

    - Por padrão, um pacote em Java sempre:

    > é escrito em lowercase
    > deve ser um nome de domínio, iniciado em com, edu, gov etc.

    É natural que o pacote seja o seu domínio (ou da empresa) como br.com.casadocodigo

    >>> Classes devem ser públicas para eu fiquem visíveis entre os pacotes
    >>> Arquivo .java obrigatoriamente tem que ter o nome da classe

    - Quando uma classe está em um pacote diferente da classe q vc está usando, um IMPORT é necessário
    - E todas as classes ficam com o package declarado deps de saíram do padrão src

    - Dá pra importar todas classes um package assim: br.com.casadocodigo.livraria.*;
    E não afeta o tempo de execução.
    O problema é que pode dar ambiguidade de nomes e torna a legibilidade mais difícil
    O ideal é importar classe a classe




    Private - apenas a clase
    Default - classe e pacote
    Protected - classe + pacote + subclasses
    public - projeto inteiro






    Invés de arrays user a API de Collections de Java?




    >>> Investigando problemas: é muito comum enviarmos a stacktrace (erro q mostra no compilador)
    qnd estamos procurando por ajuda em fóruns (como o http://guj.com.br) ou listas de discussões

    try/catch

    try {
        // algum código de risco
     } catch (ArrayIndexOutOfBoundsException e) {
        // o que fazer aqui?
     }

    catch (Exception e) { // capturar qualquer exception
    System.out.printl("deu exception no indice: "+ i);
    e.printStackTrace(); // pra ver qual exception occoreu
    }

    try {
    } catch (ArrayIndexOutOfBoundsException e) {
    System.out.printl("deu exception no indice: "+ i);
    } catch (NullPointerException e) {
    System.out.printl("O array não foi instanciado!");
    } catch (Exception e) {
    } finally { // bloco finally é executado sempre independente de ter exception acima ou n
    // alguma ação importante
    }

    Esses acima são todos unchecked exceptions, subclasses da RuntimeException e não diretamente da Exception
    No caso, o código compila com ou sem os try/catch declarados.

    No caso de checked exceptions, tipo um arquivo não existindo, daí o código obriga a tratar a exception.

  */
    /*


    try {
        new java.io.FileInputStream("arquivo.txt");
    } catch (FileNotFoundException e1) {
        System.out.println("Não consegui abrir o arquivo");
    }

    OU

    public void abreArquivo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
    }

    public static void main(string[] args) {
        try {
            abreArquivo();
        } catch (FileNotFoundException e1) {
            sout("Não consegui abrir o arquivo");
        }

     Ou melhor:

    public void abreArquivo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
    }


    public static void main(String[] args) throws FileNotFoundException {

        abreArquivo();
    }

    // Tem diferença throw e throws, o 1o informa uma exception, o 2o só informa o compilador se o
    // método lança uma exception ou não



    Tem também a classe error. Error e Exception são irmãos e herdam de Throwable.
    Erros normalmente representam problemas na JVM (como o OutOfMemoryError)

    LISTA: https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html


    usuarios.stream()
        .filter(u -> u.getPontos() > 100)
        .sorted(comparing(Usuario::getNome))
        .forEach(System.out::println);

    https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html


    pra continuar aprendendo http://www.guj.com.br/
    https://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
    http://www.casadocodigo.com.br/products/livro-java8

    Uma aplicação Java pode ser executada em qualquer um dos diferentes sistemas operacionais existentes
    como por exemplo Windows, Linux ou Mac OS.

     */




}
