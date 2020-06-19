import java.util.Scanner;
public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        float vlr = 0;
        cod = teclado.nextInt();
        qtd  = teclado.nextInt();

        if(cod == 1){
            vlr = qtd * 4.00f;
        }
        if(cod == 2){
            vlr = qtd * 4.50f;
        }
        if(cod == 3){
            vlr = qtd * 5.00f;
        }
        if(cod == 4){
            vlr = qtd * 2.00f;
        }
        if(cod == 5){
            vlr = qtd * 1.50f;
        }
        System.out.printf("Total: R$ %.2f\n", vlr);
        

    }
}