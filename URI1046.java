import java.util.Scanner;
public class URI1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inh, outh, tempo = 0;
        inh = teclado.nextInt();
        outh = teclado.nextInt();
        if(inh > outh){
            tempo = (24 - inh) + outh;
        }
        else if (outh > inh){
            tempo = (outh - inh);
        }
        else if (inh == outh && outh == inh){
            tempo = 24;
        }
        System.out.println("O JOGO DUROU "+tempo+" HORA(S)");
    }
}