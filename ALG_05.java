import java.text.DecimalFormat;
import java.util.Scanner;

public class ALG_05 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA QUANTOS CARROS FORAM VENDIDOS: ");
        int carros = resp.nextInt();

        System.out.println("ESCREVA O VALOR TOTAL DAS VENDAS EM REAIS: ");
        double totalvendas = resp.nextDouble();

        System.out.println("ESCREVA O SALARIO FIXO EM REAIS: ");
        double fixo = resp.nextDouble();

        System.out.println("ESCREVA O QUANTO O FUNCIONARIO RECEBE POR CARRO EM REAIS: ");
        double comissao = resp.nextDouble();

        double salario  = fixo+(comissao*carros)+(totalvendas*0.05);

        DecimalFormat salarioFormat = new DecimalFormat("#.##");


        System.out.print("O SALÁRIO FINAL SERÁ DE: R$");
        System.out.println(salarioFormat.format(salario));
        resp.close();

    }
}
