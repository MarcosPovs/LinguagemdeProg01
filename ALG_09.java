import java.text.DecimalFormat;
import java.util.Scanner;


public class ALG_09 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O NUMERO DE MAÇÃS COMPRADAS: ");
        int maca = resp.nextInt();

        if (maca >= 12) {

            double custo = maca;
            DecimalFormat custoformat = new DecimalFormat("#.00");

            System.out.print("o valor total da compra é:R$ ");
            System.out.print(custoformat.format(custo));
        } else {
            double custo = maca * 1.30;
            DecimalFormat custoformat = new DecimalFormat("#.##");

            System.out.print("o valor total da compra é:R$ ");
            System.out.print(custoformat.format(custo));
        }
    }
}