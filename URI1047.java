import java.util.Scanner;
public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hi, mi, hf, mf,ht,mt;
        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();
        ht=0;
        mt=0;
        if(hf > hi){
            ht = (hf - hi);
            if(ht == 1){
                ht=0;
            }
        }
        else if(ht ==0 ){
            ht=24;
        }
        else{
            ht = hi - hf;
        }
        if(mf>mi || mf==mi){
            mt = mf-mi;
        }
        else{
            mt=(60-mi)+mf;
        }
        System.out.println("O JOGO DUROU "+ht+" HORA(S) "+mt+ " MINUTO(S)");

    }
}