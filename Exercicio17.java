import java.util.Scanner;
public class Exercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario, imposto;
        salario = teclado.nextFloat();
        if(salario < 1000){
            imposto = 0;
        }
        else{
            if(salario < 2500){
                imposto = salario * 2.5f/100;
            }
            else{
                if(salario < 5000){
                    imposto = salario *25f/100;
                }
                else{
                    imposto = 1300;
                }
            }
            System.out.println("Seu imposto devido"+imposto);

        }
    }
}