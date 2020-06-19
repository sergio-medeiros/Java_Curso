import java.util.Scanner;
public class URI1142{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int N, cont, X, Y;
        X=1;
        N = teclado.nextInt();
        for (cont=1;cont<=N;cont++){
            //for(X=1;X<=3;X++){
                System.out.println((X++)+" "+(X++)+" "+(X++)+" PUM");
                X++;
            //}
        }
    }
}