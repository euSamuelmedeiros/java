package aula07;

public class laçosDerepetição {
    // while, do while e for
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;

        }
        count = 0;
        do {
            System.out.println("dentro do do-while");
            count++;
        } while (count < 10);

        for (int c = 1; c < 10; c++) {
            System.out.println("for" + c);

        }
    }
}
