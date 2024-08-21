import java.text.DecimalFormat;
import java.util.Scanner;

public class ALG_16 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O PRIMEIRO NUMERO: ");

        double despjan = 15000;
        DecimalFormat janformat = new DecimalFormat("#.00");
        double despfev = 23000;
        DecimalFormat fevformat = new DecimalFormat("#.00");
        double despmar = 17000;
        DecimalFormat marformat = new DecimalFormat("#.00");

   double   totaltri = despjan + despfev + despmar;
        DecimalFormat totalformat = new DecimalFormat("#.00");
   double mediatri = (despjan + despfev + despmar)/3;
        DecimalFormat mediaformat = new DecimalFormat("#.##");

            System.out.print("OS CUSTOS DE JANEIRO FORAM:R$ " );
        System.out.println(janformat.format(despjan));
        System.out.print("OS CUSTOS DE FEVEREIRO FORAM:R$ " );
        System.out.println(fevformat.format(despfev));
        System.out.print("OS CUSTOS DE MARÇO FORAM:R$ " );
        System.out.println(marformat.format(despmar));
        System.out.print("O CUSTO TOTAL DO TRIMESTRE FOI DE:R$ " );
        System.out.println(totalformat.format(totaltri));
        System.out.print("O CUSTO MÉDIO DO TRIMESTRE FOI DE:R$ " );
        System.out.println(mediaformat.format(mediatri));
    }
}