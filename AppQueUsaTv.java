import java.util.Scanner;
public class AppQueUsaTv{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Televisao t; //declaro a TV
        t = new Televisao(); //solicito memoria para armazenar a estrutura
                            //Televisao t = new Televisao()
        t.marca = "Samsung";
        t.tamanhotela = 42;
        t.canal = 5;
        t.volume = 10;
        t.ligada = false;
        int opcao;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhotela = 55;
        x.canal = 9;
        x.volume = 5;
        x.ligada = true;
        //Do{
        //    System.out.println("VA-VOLUME");
        //    System.out.println("VD-VOLUME");
        //    System.out.println("CA-CANAL");
        //    System.out.println("CD+CANAL CA");
        //    System.out.println("0-MULTE TV");
        //    System.out.println("D-DESLIGAR TV");
        //    System.out.println("L-LIGAR TV");
        //    System.out.println("S-Sair");
        //    S = 
        //}while()
       
        
    }
}