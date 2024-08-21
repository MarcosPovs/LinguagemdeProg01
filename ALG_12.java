import java.util.Scanner;

public class ALG_12 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O PRIMEIRO NUMERO: ");
        double num1 = resp.nextDouble();

        System.out.println("ESCREVA O SEGUNDO NUMERO: ");
        double num2 = resp.nextDouble();


        if (num1 > num2) {

            System.out.print("O NUMERO "+num1+" É MAIOR QUE O NUMERO "+num2);
        } else {
            System.out.print("O NUMERO "+num2+" É MAIOR QUE O NUMERO "+num1);
        }
    }
}