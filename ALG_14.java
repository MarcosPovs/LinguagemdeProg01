import java.util.Scanner;

public class ALG_14 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O HORARIO DE INICIO (FORMATO 24H): ");
        int inicio = resp.nextInt();

        System.out.println("ESCREVA O HORARIO DE TÉRMINO (FORMATO 24H): ");
        int fim = resp.nextInt();

        if (fim < inicio) {

            int horas = (fim - 12) - (inicio-12) + 24;
            System.out.print("O JOGO DUROU " + horas + " HORAS");
        }
        else {
            int horas = (fim - 12)- (inicio-12);
            System.out.print("O JOGO DUROU " + horas + " HORAS");
        }



    }
}