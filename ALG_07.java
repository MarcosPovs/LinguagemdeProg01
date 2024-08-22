import java.util.Scanner;


public class ALG_07 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O NUMERO: ");
        double num = resp.nextDouble();

        if (num > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
