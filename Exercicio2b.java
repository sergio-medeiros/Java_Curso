import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float base, altura, area;
//Entrada de valor
        System.out.println("Digite a base do retangulo = ");
        base = teclado.nextFloat();
        System.out.println("Digite a alturar do retangulo = ");
        altura = teclado.nextFloat();
//Calculo da Area
        area = base * altura;
//Saida do valor
        System.out.println("A area doi retagulo e = " +area);
    }
}