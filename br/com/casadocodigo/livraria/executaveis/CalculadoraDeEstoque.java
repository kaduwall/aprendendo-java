package br.com.casadocodigo.livraria.executaveis;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {

        /*

        double livroJava8;
        double livroTDD;

        livroJava8 = 59.90;
        livroTDD = 59.90;

        // Tipos PRIMITIVOS

        byte inteiro1 = 10; // 1 byte
        short inteiro2 = 10; // Até 2 bytes
        int inteiro3 = 10; // Até 4 bytes
        long inteiro4 = 10; // Até 8 bytes

        // comparando: boolean (1 bit), char (2 byte), float (4 byte), double (8 byte)


        double livroJava8 = 60; // Double pode usar decimais ex.: 59.90
        double livroTDD = 60;

        double soma = livroJava8 + livroTDD;

        System.out.println("O total em estoque é "+soma);

        int numero = 4;
        int outroNumeroIgual = numero;
        numero = numero + 5;

        System.out.println("numero é: "+numero);
        System.out.println("outroNumeroIgual é: "+outroNumeroIgual);

        // TIPOS NÃO-PRIMITIVOS

        String texto = "Eu sou uma String";
        System.out.println(texto);

        // Pra transformar uma variável em outra se usa um recurso chamado de CASTING
        // Funciona assim:

        int numeroInteiro = (int) livroJava8;

        // Se o double fosse 59.90 ia funcionar mas ia perder a precisão, ficando 59

        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;

        System.out.println("O total em estoque é "+soma);

        if (soma < 150) { // se der true
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else { // se der false
            System.out.println("Seu estoque está bom");
        }

        // Outro exemplo:

        double valor = 0;
        double v1 = 2;
        double v2 = 3;

        if (v1 > v2) {
            valor = 100;
        } else {
            valor = 0;
        }

        // mesmo exemplo mas com operador TERNÁRIO ?: pra encurtar o IF, assim:
        // * só não é tão legível

        int v1 = 10;
        int v2 = 5;
        int valor = v1 > v2 ? 100 : 0;

        System.out.println("A var valor é: "+valor);

        double valorDoLivro = 59.90;
        double soma = 0;
        //int contador = 0;

        while (contador < 35) { // só continua o código abaixo do while depois q ele fechar
            //soma = soma + valorDoLivro;
            soma += valorDoLivro; // mesma coisa do codigo acima, soh mais enxuto
            // contador += 1; // Dá pra fazer isso com os operadores -= *= /= %= também
            contador ++; // mesmo do de cima, ainda mais enxuto
        }

        for (int contador = 0; contador < 35; contador++) { // o mesmo que o while ali
            soma += 59.90;
        }

        for (double i = 0; i < 35; i ++) {soma += 59.90;} // costuma ser usado o index/índice inves da var "contador" em si

        System.out.println("O total em estoque é "+soma);

        if (soma < 150) { // se der true
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else { // se der false
            System.out.println("Seu estoque está bom");
        }

        */

        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                continue; // isso pularia o numero 7, o script continuaria até 10, só sem o 7
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                break; // isso pararia o script no 7 e nada mais seria impresso
            }
            System.out.println(i);
        }

        //
        // OPERADORES LÓGICOS
        //

        //if (v1 > v2 && v2 < 3) { // invés de encadear IFS usa o && }
        // Também tem as opções || (or) e a negativa !

        // boolean condicao = 1 > 0; // true
        // if (!condicao) {
        // se for falso entraria aqui mas não vai
        // }




    }
}
