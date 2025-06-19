package Kenumeracao.test;


import Kenumeracao.domain.Cliente;
import Kenumeracao.domain.TIpoCliente;

public class Cleintetest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("naruto", TIpoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("naruto", TIpoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("naruto", TIpoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("naruto", TIpoCliente.PESSOA_FISICA);
        

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        
    }
}
