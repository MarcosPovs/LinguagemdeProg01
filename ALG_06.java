import java.util.Scanner;


public class ALG_06 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("ESCREVA A TEMPERATURA EM FAHRENHEIT: ");
        double tempf = resp.nextDouble();

        double tempc  = (tempf - 32)* 5/9;

        System.out.println("A TEMPERATURA EM CELSIUS É DE: "+ tempc +"ºC");

    }
}