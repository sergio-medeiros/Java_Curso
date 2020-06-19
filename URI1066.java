import java.util.Scanner;
public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, par, impar, positivo, negativo;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;
        int cont;
        for(cont=1;cont<=5;cont++){
            num=teclado.nextInt();
            if(num % 2 ==0){
                par = par + 1;
            }
                else{
                impar = impar + 1;
            }
            if(num > 0){
                positivo = positivo + 1;
            }
            else if(num < 0){
                negativo = negativo + 1;
            }
        }
        System.out.printf(par+" valor(es) par(es)\n");
        System.out.printf(impar+" valor(es) impar(es)\n");
        System.out.printf(positivo+" valor(es) positivo(s)\n");
        System.out.printf(negativo+" valor(es) negativo(s)\n");
    }
}