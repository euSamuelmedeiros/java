package introduçãoJavaClasses.test;

import introduçãoJavaClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

         estudante.name = "harry";
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.name);

        System.out.println("-------------------");

        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.name);
    }
}
