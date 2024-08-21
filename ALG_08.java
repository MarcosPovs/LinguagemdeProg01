import java.util.Scanner;


public class ALG_08 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA UM NUMERO: ");
        double num = resp.nextDouble();

        if (num >= 0) {
            System.out.println("É POSITIVO!");
        } else {
            System.out.println("É NEGATIVO");
        }
    }
}