import java.util.Scanner;
public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont, X=0;
        X=teclado.nextInt();
        for(cont=0;cont<=X;cont++){
            if(cont % 2 != 0){
                System.out.println(cont);
            }
        }
    }
}