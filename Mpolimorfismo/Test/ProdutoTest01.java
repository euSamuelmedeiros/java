package Mpolimorfismo.Test;


import Mpolimorfismo.Domain.Computador;
import Mpolimorfismo.Domain.Tomate;
import Mpolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook Pro", 10000);
        Tomate tomate = new Tomate("Tomatão", 10);

        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.calcularImposto(computador);
        System.out.println("-----------------------");
        calculadora.calcularImposto(tomate);
    }
}
