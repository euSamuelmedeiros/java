package Hhereança.domain;

public class Funcionario extends Pessoa {
    
    private double salario;

    public void imprimeai(){
        super.imprimeai();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
