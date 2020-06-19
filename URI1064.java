import java.util.Scanner;
public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont,total=0;
        float num, media=0,soma = 0;
        for(cont=0;cont <=5;cont++){
            num =teclado.nextFloat();
            if(num >= 0){
                total = total + 1;
                soma = num + soma;
            }
        }
        media = soma / total;
        System.out.println(total+" valores positivos");
        System.out.printf("%.1f\n",media);
    }
}