package Dcontrutores.test;

import Dcontrutores.Dominio.Desenhos;

public class DesenhosTest {
    public static void main(String[] args) {
        Desenhos desenho = new Desenhos();
        desenho.intic("rei leao", 40, "TV", "Açao");
        desenho.imprimeDesenho();

    }
}
