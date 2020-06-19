import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float altura, resultado;       
        int sexo;
        sexo = teclado.nextInt();
        altura = teclado.nextFloat();

        if(sexo == 0 || sexo == 1){
            if(sexo == 0){
                resultado = (72.7f*altura) - 58;
                System.out.println("O peso Homens = "+resultado);
            }
            else{
                resultado = (62.1f*altura) - 44.7f;
                System.out.println("O peso mulheres = "+resultado);
            }
        }
        System.out.println("Fim do Programa");
    }

}