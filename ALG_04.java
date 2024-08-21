import java.text.DecimalFormat;
import java.util.Scanner;

public class ALG_04 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O CUSTO DE FÁBRICA DE UM CARRO EM REAIS: ");
        double custo = resp.nextDouble();

        double dist = custo *0.28;
        double impostos = custo *0.45;
        double venda = custo + dist + impostos;

        DecimalFormat distFormat = new DecimalFormat("#.##");
        DecimalFormat impFormat = new DecimalFormat("#.##");
        DecimalFormat vendaFormat = new DecimalFormat("#.##");

        System.out.print("A COMISSÃO SERÁ DE: R$");
        System.out.println(distFormat.format(dist));
        System.out.print("CUSTO DE IMPOSTOS SERÁ DE: R$");
        System.out.println(impFormat.format(impostos));
        System.out.print("O PREÇO DE VENDA SERÁ DE: R$");
        System.out.print(vendaFormat.format(venda));

    }
}