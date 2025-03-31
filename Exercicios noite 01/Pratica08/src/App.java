import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        String cidade;
        float distancia = 0;
        float eficiencia = 0;
        float valor = 0;
         
        Scanner scan = new Scanner (System.in);
                
                System.out.println("Insira a cidade desejada:");
                cidade = scan.next();

                System.out.println("Insira a distância:");
                distancia = scan.nextInt ();


                System.out.println("Insira a eficiencia do seu carro:");
                eficiencia = scan.nextInt();

                System.out.println("Insira o valor do litro de gasolina:");
                valor = scan.nextInt ();

                float consumo = valor/eficiencia;
                float custo = consumo * distancia;


                    System.out.println("Cidade desejada:" + (cidade));
                    System.out.println("Custo da viagem:" + (custo));


    }
}
