import java.util.Scanner;
public class URI1020{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int idadeDias = input.nextInt();

        int anos, meses, dias;
        int resto;

        anos = idadeDias / 365 ; 

        resto = idadeDias % 365;

        meses = resto /30;

        dias = resto % 30;

        System.out.println( anos + " ano(s))");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}