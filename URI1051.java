import java.util.Scanner;
public class URI1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario, imposto;
        salario = teclado.nextFloat();
        if(salario <= 2000f){
            System.out.println("Isento");
        }
        else{
            if(salario > 2000f && salario <= 3000f){
                imposto = (salario - 2000f);
                imposto = (imposto * 0.08f);
                System.out.printf("R$ %.2f\n", imposto);
            }
            else{
                if(salario > 3000f && salario <= 4500f){
                    imposto = (salario - 3000f);
                    imposto = (imposto * 0.18f);
                    imposto = (imposto + 80f);
                    System.out.printf("R$ %.2f\n", imposto);
                }
                else{
                    imposto = salario - 4500f;
                    imposto = (imposto * 0.28f);
                    imposto = (imposto + 80f + 270f);
                    System.out.printf("R$ %.2f\n", imposto);
                }
            }
        }
    }
}