public class Televisao{
    String marca;
    int tamanhotela;
    int canal;
    int volume;
    boolean ligada;
    void power(){
        ligada=!ligada;
        if(ligada = true){
            System.out.println("Status da TV "+marca+" : Ligada");
        }
        else{
            System.out.println("Status da TV "+marca+" : Desligada");
        }
        
    }
    void avancaCanal(){
        if(ligada = true){
            if(canal <= 99){
                canal++;
                System.out.println("A TV "+marca+" esta no canal "+canal);
            }
            else{
                System.out.println("A TV "+marca+" esta no canal maximo");
            }
        }
    }
    void diminuirCanal(){
        if(ligada = true){
            if(canal < 1){
                canal--;
                System.out.println("A TV "+marca+" esta no canal "+canal);
            }
            else{
                System.out.println("A TV "+marca+" esta no canal minimo");
            }
        }
    }
    void avancaVolume(){
        if(ligada = true){
            if(volume < 10){
                volume++;
                System.out.println("A TV "+marca+" esta no volume  "+volume);
            }
            else{
                System.out.println("A TV "+marca+" esta no volume maximo");
            }
        }
    }
    void diminuirVolume(){
        if(ligada = true){
            if(volume <1){
                volume--;
                System.out.println("A TV "+marca+" esta no volume  "+volume);
            }
            else{
                System.out.println("A TV "+marca+" esta no volume minimo");
            }
        }
    }
    void muteVolume(){
        if(ligada = true){
            if(volume != 0){
                volume = 0;
                System.out.println("A TV "+marca+" esta no mudo");
            }
            else{
                System.out.println("A TV "+marca+" ja esta no mudo");
            }
        }
    }
}