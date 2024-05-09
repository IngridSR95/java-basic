package exemplos;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //TIPOS PRIMITIVOS:
       
       String meuNome = "Ingrid"; 
        
       double salarioMinimo = 2000.50;
       float pi = 3.14F; //para identificar como float precisa do F no final
       long cpf = 658620865L; //mesma lógica do float L

       //short numeroCurto = 1;
       //int numeroNormal = numeroCurto;
       //short numeroCurto = (short) numeroNormal;

       //Neste exemplo a variável pode ser submetida à mudanças.
       int numero = 1;
       numero = 2;

       // se você deseja que o valor nunca mude: (Constante)
       final double VALOR_DE_PI = 3.14;

        System.out.println(meuNome);
        System.out.println(salarioMinimo);
        System.out.println(pi);
        System.out.println(cpf);
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);


    }
}
