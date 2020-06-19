import java.util.Scanner;
public class URI1072{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, X, in, outs, cont=0;
        N = teclado.nextInt();
        //X = N;
        in = 0;
        outs = 0;
        while( cont < N){
            X = teclado.nextInt();
            if (X >= 10 && X <= 20){
                in++;
            }
            else{
                outs++;
            }
            cont++;
        }
        System.out.println(in+" in");
        System.out.println(outs+" out");

    }
}