import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        float altura = 0;
        float peso = 0;

        Scanner scan = new Scanner (System.in);

        System.out.println("Insira sua altura:");
        altura = scan.nextFloat();

        System.out.println("Insira seu peso:");
        peso = scan.nextFloat();

        System.out.println("IMC:" + (peso/altura));

    
    }
}
