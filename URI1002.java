import java.util.Scanner;
public class URI1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio,area, n;
        n = 3.14159;
        raio = teclado.nextDouble(); 
        raio = raio * raio;
        area = n * raio;
        System.out.printf("A=%.4f\n"area);
    }
}