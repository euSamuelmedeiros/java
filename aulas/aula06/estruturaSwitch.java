package aula06;

public class estruturaSwitch {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando domingo como 1
        byte day = 1;
        switch (day) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opçao invalida."); // o defaut pode estar em qualquer lugar do codigo.

        }
    }
}