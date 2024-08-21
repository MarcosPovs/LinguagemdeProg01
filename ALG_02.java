import java.util.Scanner;

public class ALG_02 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A QUANTIDADE DE VOTOS BRANCOS: ");
        int brancos = resp.nextInt();

        System.out.println("ESCREVA A QUANTIDADE DE VOTOS NULOS: ");
        int nulos = resp.nextInt();

        System.out.println("ESCREVA A QUANTIDADE DE VOTOS VÁLIDOS: ");
        int validos = resp.nextInt();

        double total = brancos + nulos + validos;
        double porbrancos = (brancos / total) * 100;
        double pornulos = (nulos / total) * 100;
        double porvalidos = (validos / total) * 100;

        System.out.println("A QUANTIDADE DE VOTOS TOTAIS É: "+ total);
        System.out.println("A PORCENTAGEM DE VOTOS BRANCOS É: "+ porbrancos + "%");
        System.out.println("A PORCENTAGEM DE VOTOS NULOS É: "+ pornulos + "%");
        System.out.println("A PORCENTAGEM DE VOTOS VÁLIDOS É: "+ porvalidos + "%");
    }
}