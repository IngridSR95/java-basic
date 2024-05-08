package edu.ingrid.exercício2;
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        System.out.print ("primeiro contado a sintaxe de java\n");
        String primeiroNome = "Ingrid";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.err.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
