import java.util.Scanner;


public class ALG_11 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA O SEU ANO DE NASCIMENTO ");
        int nasc = resp.nextInt();

        int idade = 2024 - nasc;


        if (idade >= 16) {

            System.out.print("A SUA IDADE É "+ idade +" ANOS, PORTANTO VOCÊ JA PODE VOTAR!");
        } else {
            System.out.print("A SUA IDADE É "+ idade +" ANOS, PORTANTO VOCÊ AINDA NÃO PODE VOTAR");
        }
    }
}