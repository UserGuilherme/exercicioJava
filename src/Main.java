import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Locale.setDefault(Locale.JAPAN);
        Scanner sc  = new Scanner(System.in) ;

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double  area = largura * comprimento;
        double preco =  area * metroQuadrado;


        System.out.println("AREA =" + area);
        System.out.println("PRECO =" + preco);


        sc.close();

    }
}