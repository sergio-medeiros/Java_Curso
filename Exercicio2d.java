import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        // declarando objecto
        Scanner teclado = new Scanner(System.in);
        // declarando variaveis
        float area, diagonal1, diagonal2;
        //entrando com os valores
        System.out.println("Digite o valor do Diagonal 1 = ");
        diagonal1 = teclado.nextFloat();
        System.out.println("Digite o valor do Diagonal 2 = ");
        diagonal2 = teclado.nextFloat();
        //Calculando
        area = diagonal1 * diagonal2;
        //Mostrando resultado
        System.out.println("O valor da Area e = " +area);
    }
}