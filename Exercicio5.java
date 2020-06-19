import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]){
        //Declarando objecto
        Scanner teclado = new Scanner(System.in);
        //Desclarando Variavel
        float velocidade,tempo,distancia,litros;
        //entrando com dados
        System.out.println("Digite a Velocidade = ");
        velocidade = teclado.nextFloat();
        System.out.println("Digite o tempo = ");
        tempo = teclado.nextFloat();
        //Calculo
        distancia = velocidade * tempo;
        litros = distancia / 12;
        System.out.printf("Distancia %.3f km a uma Velocidade de %.3f km/h e consumiu %.3f litro\n", distancia, velocidade,litros);
        //System.out.printf("Voce percorreu %.3f km a uma velocidade de %.3f km/l e consumiu %.3f litro\n",ditancia, velocidade, litros);
    }
}
        