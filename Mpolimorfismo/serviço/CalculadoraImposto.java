package Mpolimorfismo.serviço;

import Mpolimorfismo.Domain.Computador;
import Mpolimorfismo.Domain.Tomate;

public class CalculadoraImposto {

    public void calcularImposto(Computador computador) {
        double imposto = computador.taxavel();
        System.out.println("Relatório do imposto do computador:");
        System.out.println("Computador: " + computador.getName());
        System.out.println("Valor: R$ " + computador.getValor());
        System.out.println("Imposto a ser pago: R$ " + imposto);
    }

    public void calcularImposto(Tomate tomate) {
        double imposto = tomate.taxavel();
        System.out.println("Relatório do imposto do tomate:");
        System.out.println("Tomate: " + tomate.getName());
        System.out.println("Valor: R$ " + tomate.getValor());
        System.out.println("Imposto a ser pago: R$ " + imposto);
    }
}
