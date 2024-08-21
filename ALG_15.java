import java.util.Scanner;

public class ALG_15 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A QUANTIDADE DE HORAS TRABALHADAS: ");
        int horas = resp.nextInt();

        System.out.println("ESCREVA SALÁRIO DO FUNCIONÁRIO POR HORA TRABALHADA: ");
        double valorhora = resp.nextDouble();
        double salario;

        if (horas <=40) {

            salario = horas * valorhora;
        }
        else {
            salario = (40 * valorhora) + ((horas - 40) + (valorhora * 1.5));
        }
        System.out.print("O SALÁRIO É DE R$ " + salario);


    }
}