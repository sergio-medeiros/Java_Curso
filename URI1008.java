import java.util.Scanner;
public class URI1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NUMBER, horas;
        double SALARY, vlrhora;
        NUMBER = teclado.nextInt();
        horas = teclado.nextInt();
        vlrhora = teclado.nextDouble();
        SALARY = horas * vlrhora;
        System.out.printf("NUNBER = %.2f" +NUMBER);
        //System.out.printf("SALARY=%.2f\n"SALARY);
       // System.out.printf("A=%.4f\n"area);
    }
}