import java.util.Scanner;
public class URI1018{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int resto, cem, cinq, vinte, dez, cinco, dois, um;
        cem = N / 100;
        cinq = (N % 100) / 50;
        vinte = ((N % 100)% 50) / 20;
        dez = (((N % 100) % 50) % 20) / 10;
        cinco = ((((N % 100)%50)%20)%10)/5;
        dois = (((((N%100)%50)%20)%10)%5) / 2;
        um = ((((((N%100)%50)%20)%10)%5)%2) / 1;

        System.out.println(N);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }

}