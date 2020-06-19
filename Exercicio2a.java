import java.util.Scanner; // Entrada de dados

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float lado,area;

        //entrada do valor do quadrado

        System.out.println("Digite o valor da lado do quaradro = ");
        lado = teclado.nextFloat();

        //Processamento

        area = lado * lado;

        //mostrar Resultado

        System.out.println("O Resultado da area = "+area);
    }
}