import java.util.Scanner;
public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int par=0;
        int cont, num;

        for(cont=1;cont<=5;cont++){
            num = teclado.nextInt();
            if(num % 2 == 0 ){
                par = par + 1;
            }
        }
        System.out.println(par+" valores pares");
    }
}