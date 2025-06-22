package Mpolimorfismo.Domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.10;

    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxavel() {
        System.out.println("Calculando imposto do tomate...");
        return valor * IMPOSTO_POR_CENTO;
    }
}