package br.com.casadocodigo.livraria.executaveis;

public class ConsultaDeDescontos {

    public static void main(String[] args) {



        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        double desconto = gerenciador.validaCupom("cab11");

        if (desconto != 0) {
            System.out.println("Cupom de desconto válido.");
            System.out.println("Valor: "+ desconto);
        } else {
            System.out.println("Esse cupom não existe");
        }

        /*

        if (gerenciador.validaCupom("CUP116")) {
            System.out.println("Cupom de desconto válido");

        } else {
            System.out.println("Esse cupom não existe");
        }

         */




    }

}
