    import java.util.Scanner; // vou precisar usar a biblioteca Scanner
    public class TesteEntrada{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int a,b,c;
            System.out.printf("Digite o valor de A = ");
            a = teclado.nextInt();
            System.out.printf("Digite o valor de B = ");
            b = teclado.nextInt();
            c = a + b;
            System.out.println("Valor de a = " + a);
            System.out.println("Valor de b = " + b);
            System.out.println("Valor de c = " + c);
            System.out.println("Digite o valor de A e B");
            System.out.print("Valor de d");
            double d = teclado.nextDouble();
            //double d = 3.14;
            
        }
    }