import java.util.Scanner;

import static java.lang.Math.max;

public class ALG_17 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A NOTA P1: ");
        double p1 = resp.nextDouble();
        System.out.println("ESCREVA A NOTA E1: ");
        double e1 = resp.nextDouble();
        System.out.println("ESCREVA A NOTA E2: ");
        double e2 = resp.nextDouble();
        System.out.println("ESCREVA A NOTA DA API: ");
        double api = resp.nextDouble();
        System.out.println("ESCREVA A NOTA X: ");
        double x = resp.nextDouble();
        System.out.println("ESCREVA A NOTA SUB (SE NÃO HOUVE SUB DIGITE 0 ");
        double sub = resp.nextDouble();


        double lp1 = (p1*0.6+((e1+e2)/2)*0.4)*0.5+(max(((p1*0.6+((e1+e2)/2)*0.4)-5.9),0)/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2);

        System.out.println(" A MÉDIA DO SEMESTRE É " + lp1);

    }
}