package BintroduçãoMetodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] wage;

    public void imprimee() {
        System.out.println(this.age);
        System.out.println(this.wage);
        System.out.println(this.name);
        if (wage != null) {
            for (double wages : wage) {
                System.out.print(wages + " ");
            }
        }
        wagesMedia();
    }

    public void wagesMedia() {
        if (wage == null) {
            return;
        }
        double media = 0;

        for (double wages : wage) {
            media += wages;
        }
        media = media / wage.length;
        System.out.println("\nmedia salarial " + media);

    }
}