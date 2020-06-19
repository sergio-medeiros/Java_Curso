import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //declarando variaveis
        float area, base, altura;
        //entrada dos dados
        System.out.println("Digite o valor da base = ");
        base = teclado.nextFloat();
        System.out.println("Digite o valor da altura = ");
        altura = teclado.nextFloat();
        //Fazer o calculo
        area = (base * altura)/2;
        //mostrar resultado
        System.out.println("O valor da Area e = " +area);
    }
}