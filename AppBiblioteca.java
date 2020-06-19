import java.util.Scanner;
public class AppBiblioteca{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Biblioteca B1, B2, B3, B4, B5;
        String livro;
        boolean verifica;

        B1 = new Biblioteca("Livro1","Jose",1990,"CAT1","E01P10",true);
        B2 = new Biblioteca("Livro2","Santo",2000,"CAT2","E02P20",false);
        B3 = new Biblioteca("Livro3","Fulano",2001,"CAT3","E03P30",true);
        B4 = new Biblioteca("Livro4","Vagner",2002,"CAT4","E04P40",false);
        B5 = new Biblioteca("Livro5","Claudio",2003,"CAT5","E05P50",true);


        System.out.println("");
        System.out.println(B1.imprimir());
        System.out.println(B2.imprimir());
        System.out.println(B3.imprimir());
        System.out.println(B4.imprimir());
        System.out.println(B5.imprimir());
        System.out.println("");

        B1.setStatus(false);

        System.out.println(B1.imprimir());
        System.out.println(B2.imprimir());
        System.out.println(B3.imprimir());
        System.out.println(B4.imprimir());
        System.out.println(B5.imprimir());

    }

}