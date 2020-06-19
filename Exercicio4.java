import java.util.Scanner;
public class Exercicio4{
    public static void main(String args[]){
        //Declarando objecto
        Scanner teclado = new Scanner(System.in);
        //Desclarando Variavel
        float salario, horatrabalho,horas,desconto;
        //entrando com dados
        System.out.println("Digite o valor da hora trabalhanda = ");
        horatrabalho = teclado.nextFloat();
        System.out.println("Digite o total de horas trabalhada = ");
        horas = teclado.nextFloat();
        System.out.println("Digite o desconto do inss = ");
        desconto = teclado.nextFloat();
        //calculo
        salario = (horatrabalho * horas);
        salario = salario - (desconto/0.1f);
        //Resultado
        System.out.printf("O salario liquido e %.2f\n", salario);
    }   
}