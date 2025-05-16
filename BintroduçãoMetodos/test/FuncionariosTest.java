package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Funcionario;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionario employees = new Funcionario();

        employees.name = "roberto";
        employees.age = 34;
        employees.wage  = new double[]{1200, 987.23, 2000};

        employees.imprimee();
        

    }
}
