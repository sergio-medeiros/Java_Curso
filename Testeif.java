import java.util.Scanner;
public class Testeif;{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1, n2 media;
        n1= teclado.nextFloat();
        n2= teclado.nextFloat();
        media = (n1 + n2)/2;

        System.out.println("Media final = "+media);
        if(media >= 6.0f){
            System.out.println("PARABENS - APROVADO!");
        }
        else{
            System.out.println("REPROVADO");
        }
        Sytem.out.println("Fim do Progrma");
    }
}