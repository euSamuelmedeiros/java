package aula05.aula5condicionaispt03;

public class ternario {
    public static void main(String[] args) {
        double wage = 2000;
        String mensagemDoar = "EU VOU DOAR 500 REAIS PARA ALGUEM";
        String mensagemNaoDOAR = "nao tenho condiçoes de doar ainda";
        String resultado = wage > 5000 ? mensagemDoar : mensagemNaoDOAR;
        System.out.println(resultado);
    }
}
