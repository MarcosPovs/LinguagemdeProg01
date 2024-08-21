import java.text.DecimalFormat;
import java.util.Scanner;

public class ALG_03 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A O SALÁRIO EM REAIS: ");
        double salario = resp.nextDouble();

        System.out.println("ESCREVA O PERCENTUAL DE REAJUSTE EM %: ");
        double reajuste = resp.nextDouble();

        double total = salario *(1+(reajuste/100));
        DecimalFormat totalFormat = new DecimalFormat("#.##");
        System.out.print("O NOVO SALÁRIO SERÁ DE: R$");
        System.out.print(totalFormat.format(total));

    }
}