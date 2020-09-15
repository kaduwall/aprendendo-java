package br.com.casadocodigo.livraria.executaveis;

import java.util.HashSet;
import java.util.Set;

public class TestandoPerformance {

    public static void main(String[] args) {

        /*List<String> colecao = new ArrayList<String>();

        for (int i = 0; i < 100000; i++) {
            colecao.add("Item"+i);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item"+i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou "+(tempo)+" ms para executar."); // deu 15115ms aqui */

        //List<String> colecao = new ArrayList<String>();

        ///// TESTE COM HASHSET INVÉS DE ARRAYLIST:

        Set<String> colecao = new HashSet<String>();

        for (int i = 0; i < 100000; i++) {
            colecao.add("Item"+i);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item"+i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou "+(tempo)+" ms para executar."); // deu 17 a 27ms aqui :o



    }

}
