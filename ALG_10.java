import java.util.Scanner;


public class ALG_10 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A PRIMEIRA NOTA: ");
        double nota1 = resp.nextDouble();

        System.out.println("ESCREVA A SEGUNDA NOTA: ");
        double nota2 = resp.nextDouble();

        double media = (nota1 +nota2)/2;

        if (media >= 6) {

            System.out.print("O ALUNO ESTÁ APROVADO! ");
            System.out.print("O A MÉDIA DO ALUNO É: "+media);
        } else {
            System.out.print("O ALUNO ESTÁ REPROVADO! ");
            System.out.print("O A MÉDIA DO ALUNO É: "+media);
        }
    }
}