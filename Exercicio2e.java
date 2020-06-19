import java.util.Scanner;
public class Exercicio2e{
    public static void main(String args[]){
        //Criando objecto de entrada
        Scanner teclado = new Scanner(System.in);
        //Criando variavel
        float area, basemaior, basemenor, altura;
        //Entrando com valores
        System.out.println("Digite o valor da Base maior = ");
        basemaior = teclado.nextFloat();
        System.out.println("Digite o valor da Base menor = ");
        basemenor = teclado.nextFloat();
        System.out.println("Digite o valor da Altura = ");
        altura = teclado.nextFloat();
        //Calculando
        area = (basemaior + basemenor) * altura /2;
        //Resultado
        System.out.println("O valor da area e = " +area);
    }
}