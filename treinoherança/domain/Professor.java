package treinoherança.domain;

public class Professor extends Pessoa{
    private double salario;

    public void imprimi(){
        super.imprimi();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
