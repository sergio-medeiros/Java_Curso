import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        //Declarando objeto
        Scanner teclado = new Scanner(System.in);
        //Declarando Variavies
        float volume, altura,largura,profundidade;
        //Recebendo valores
        System.out.println("Digite a altura = ");
        altura = teclado.nextFloat();
        System.out.println("Digite a largura = ");
        largura = teclado.nextFloat();
        System.out.println("Digite a profundidade = ");
        profundidade = teclado.nextFloat();
        //calculando
        volume = altura * largura * profundidade;
        //Resultado
        System.out.println("O volume e = " +volume);

    }
}