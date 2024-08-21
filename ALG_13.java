import java.util.Scanner;

public class ALG_13 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O PRIMEIRO NUMERO: ");
        double num1 = resp.nextDouble();

        System.out.println("ESCREVA O SEGUNDO NUMERO: ");
        double num2 = resp.nextDouble();


        if (num1 > num2) {

            System.out.print("OS NUMEROS EM ORDEM CRESCENTE SÃO: " +num2+ " e " +num1);
        } else {
            System.out.print("OS NUMEROS EM ORDEM CRESCENTE SÃO: " +num1+ " e " +num2);
        }
    }
}