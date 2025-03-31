import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    float distancia1 = 0;
    float distancia2 = 0;

        Scanner scan = new Scanner (System.in);
        
        System.out.println("Insira valor da quilometragem do primeiro ponto:");
        distancia1 = scan.nextInt ();

        System.out.println("Insira valor da quilometragem do segundo ponto:");
        distancia2 = scan.nextInt ();

        System.out.println("Distancia calculada entre os dois pontos:" + (distancia1 - distancia2));






    }
}
