import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]){
        //Declado objeto
        Scanner teclado = new Scanner(System.in);
        //Variaveis
        float salario, kw,vlrkw,desconto,Conta;
        //Entrada de valores
        System.out.println("Digite o salario = ");
        salario = teclado.nextFloat();
        System.out.println("Digite o kw = ");
        kw = teclado.nextFloat();
        //Calculo
        vlrkw = salario / 7 /100;
        Conta = vlrkw * kw;
        desconto = Conta - (Conta * 0.1f);
        //Resultado
        System.out.printf("o valor em reais de cada kw = %.2f\n", vlrkw);
        System.out.printf("o valor em reais a ser pago = %.2f\n", Conta);
        System.out.printf("o novo valor a ser pago por essa residencia com um desconto de 10%% = %.2f\n", desconto);



    }
}