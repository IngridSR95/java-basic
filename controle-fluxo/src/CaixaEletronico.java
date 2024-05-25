public class CaixaEletronico {
    public static void main(String[] args) {
        
        //Condicional Simples
        double saldo =25.0;
        double valorSolicitado = 2.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        else
            System.out.println("saldo insuficiente");

        System.out.println(saldo);

    }
}