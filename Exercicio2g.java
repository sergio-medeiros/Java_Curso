import java.util.Scanner;
public class Exercicio2g{
    public static void main(String args[]){
        //Declado objecto
        Scanner teclado = new Scanner(System.in);
        //Declarando Variavel
        float volume, lado;
        //entrando com valores
        System.out.println("Digite o lado = ");
        lado = teclado.nextFloat();
        //Calculando
        volume = lado * lado * lado;
        //Resultado
        System.out.println("O volume e = " +volume);
    }
}