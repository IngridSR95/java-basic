package exemplos.exercicio;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        
        ligada = true;
    }

    public void desligar(){

        ligada = false;
    }

    //métodos de volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " +volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " +volume);

    }

    //Métodos de canal
    public void mudarCanal(int novoCanal){ //parâmetro
        canal = novoCanal;
        System.out.println("Mudando para o canal: " +canal);
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}

/* Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

    Ela tenha as características: ligada (boolean), canal (int) e volume (int);

    Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

    Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

    Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente. */

