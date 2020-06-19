import java.util.Scanner;
public class URI1134{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int cod, talcool, tgasolina, tdiesel;
        talcool = 0;
        tdiesel=0;
        tgasolina=0;
        do{
            //System.out.println("1-Alcool");
            //System.out.println("2-Gasolina");
            //System.out.println("3-Diesel");
            //System.out.println("4-Fim");
            cod = teclado.nextInt();
            if (cod < 4){
                if(cod == 1){
                    talcool++;
                }
                else if (cod == 2){
                    tgasolina++;
                }
                else if (cod == 3){
                    tdiesel++;
                }
            }
        }while(cod != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+talcool);
        System.out.println("Gasolina: "+tgasolina);
        System.out.println("Diesel: "+tdiesel);

    }
}