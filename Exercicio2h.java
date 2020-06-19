import java.util.Scanner;
public class Exercicio2h{
    public static void main(String args[]){
        //Declando objeto
        Scanner teclado = new Scanner(System.in);
        //Variavies
        float volume,raio,altura;
        float PI;
        //Entrando com o valor
        System.out.println("Digite o raio = ");
        raio = teclado.nextFloat();
        System.out.println("Digite a altura = ");
        altura = teclado.nextFloat();
        PI = 3.14f;
        //Calculando
        volume = PI * raio * raio * altura;
        //Mostra resultado
        System.out.println("O volume e = " +volume);
        //Resultado formatado
        System.out.printf("O volume e = %.2f\n", volume);
    }
}