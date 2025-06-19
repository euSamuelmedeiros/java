package Kenumeracao.domain;

public class Cliente {
    private String name;
    private TIpoCliente tipoCliente;

    public Cliente(String name, TIpoCliente tipoCliente) {
        this.name = name;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente [name=" + name + ", tipoCliente=" + tipoCliente + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TIpoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TIpoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}