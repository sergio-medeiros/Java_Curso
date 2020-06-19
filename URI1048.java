import java.util.Scanner;
public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario = 0, reajuste;
        salario = teclado.nextFloat();
        if(salario <=400f){
            reajuste = salario * 0.15f;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if(salario > 400f && salario <=800f){
            reajuste = salario * 0.12f;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if(salario > 800f && salario <= 1200f){
            reajuste = salario * 0.10f;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if(salario > 1200f && salario <=2000){
            reajuste = salario * 0.07f;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else{
            reajuste = salario * 0.04f;
            salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}