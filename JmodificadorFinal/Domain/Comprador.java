package JmodificadorFinal.Domain;

public class Comprador {
    private String name;

    @Override
    public String toString() {
        return "Comprador [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
