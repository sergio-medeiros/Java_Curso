import java.util.Scanner;
public class URI1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int positivo = 0, cont;
        float num;
        for(cont=1;cont<=6;cont++){
            num = teclado.nextFloat();
            if(num > 0){
                positivo = positivo + 1;
            }
        }
        System.out.println(positivo + " valores positivos");
    }
}