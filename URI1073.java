import java.util.Scanner;
public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, cont;
        int resp=0;
        N = teclado.nextInt();
        for(cont=1;cont<=N;cont++){
            if(cont % 2 == 0){
                resp = cont * cont;
                System.out.println(cont+ "^2 = "+resp);
            }
        } 
    }
}