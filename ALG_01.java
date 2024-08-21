import java.util.Scanner;

public class ALG_01 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A QUANTIDADE EM ANOS: ");
        int ano = resp.nextInt();

        System.out.println("ESCREVA A QUANTIDADE EM MESES: ");
        int mes = resp.nextInt();

        System.out.println("ESCREVA A QUANTIDADE EM DIAS: ");
        int dia = resp.nextInt();

        int idade = (ano * 365) + (mes * 30) + (dia);

        System.out.println("A IDADE EM DIAS É " + idade + " DIAS");

    }
}