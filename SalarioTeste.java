public class SalarioTeste{
    public static void main(String args[]){
        Empregado p1;

        p1 = new Empregado("Sergio","Analista",1000);

        System.out.println(p1.imprimir());
        p1.Aumento(15);
        System.out.println(p1.imprimir());
    }
}