import java.util.Scanner;
public class URI1040{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1, n2,n3, n4, peso, exame, mediaf = 0, media = 0;
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();
        //peso = 2+3+4+1
        media = ((n1 * 2)+(n2 * 3)+(n3 * 4)+ (n4 * 1)) /10;
        if(media >= 7.0f){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else{
            if(media < 5.0f){
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno reprovado.");
            }
            else{
                if(media >= 5.0f && media <=6.9f){
                    System.out.printf("Media: %.1f\n", media);
                    System.out.println("Aluno em exame.");
                    //exame = teclado.nextFloat();a
                    exame = teclado.nextFloat();
                    mediaf = (exame + media) / 2;
                    System.out.printf("Nota do exame: %.1f\n", exame);
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n", mediaf);
                }
            }
        }
    }
}