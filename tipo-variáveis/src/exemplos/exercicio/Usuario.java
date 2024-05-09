package exemplos.exercicio;

public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " +smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        //desligando e ligando
        smartTv.ligar ();
        System.out.println("Novo status -> TV Ligada " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV desligada " + smartTv.ligada);

        //Aumentando e diminuindo volume
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(7);

    }
    
}
