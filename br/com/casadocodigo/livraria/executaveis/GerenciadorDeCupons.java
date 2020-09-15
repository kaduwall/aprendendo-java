package br.com.casadocodigo.livraria.executaveis;

import java.util.*;

/* Antes tava assim:

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

e agora inserindo o util.map tbm ele foi pra java.util.*
 */

public class GerenciadorDeCupons {

    //private List<String> cupons;
    //private Set<String> cupons; // pra Hashset

    private Map<String, Double> cupons;



    public GerenciadorDeCupons() {

        //asList é uma fábrica de List e é mt bom pra esse caso
        //this.cupons = Arrays.asList("CUP74", "CUP85", "CUP116", "CUP207");

        // ^ poderíamos usar ArrayList e chamar seu método add pra cada elemento, mas é mais comum e rápido como acima nesse caso

        /* Melhor ainda:

        this.cupons = new HashSet<String>(); // Apesar do Hashset, o tipo dos cupons é Set
        cupons.addAll(Arrays.asList("CUP74", "CUP85", "CUP116", "CUP287")); // Poderia chamar no .add tbm

        O hashset tem uma performance melhor do que a List pra consultas (com o método contains por ex)
        */


        /* MAP, conjunto ( Set ) de chaves associados a um objeto valor.

        Map<String, Double> mapa = new HashMap<>();
        mapa.put("cab123", 5.99);
        Double valor = mapa.get("cab123");
        System.out.println(valor);

         */

        this.cupons = new HashMap<>();
        cupons.put("cab11", 10.0);
        cupons.put("cab22", 12.0);
        cupons.put("cab33", 13.0);
        cupons.put("cab44", 14.0);

    }

    //public boolean validaCupom(String cupom) {
        //return this.cupons.contains(cupom); // vai retornar true ou false se a string utilizada existir na var cupons

        //return this.cupons.containsKey(cupom); com o HashMap, retornaria true ou false

    public double validaCupom(String cupom) {

        if (this.cupons.containsKey(cupom)) {
            return this.cupons.get(cupom); // já retorna o valor do cupom
        } else {
            return 0;
        }
    }



}
