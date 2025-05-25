package FmodificadorEtatico.dominio;

public class car {
    private String name;
    private double maxSpeed;
    public static double limitSpeed = 250;

    public car(String name, double maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

     public void imprimee(){
        System.out.println("---------------------");
        System.out.println("name "+ this.name);
        System.out.println("velocidade maxima "+ this.maxSpeed);
        System.out.println("limite de velocidade "+ car.limitSpeed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setmaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;

    }

    public double getMaxspeed() {
        return maxSpeed;
    }


   
}
