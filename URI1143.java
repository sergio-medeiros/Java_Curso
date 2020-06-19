import java.util.Scanner;
public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N,cont,Y,Z,W;
        Y=1;
        Z=0;
        W=0;
        N = teclado.nextInt();
        for(cont=1;cont<=N;cont++){
            System.out.println(Y+" "+(Z=Y*Y)+" "+(W=Y*Z)); 
            Y++;
            Z=0;           
            W=0;
        }
    }
}