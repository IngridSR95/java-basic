package estruturascondicionais;
public class BoletimEscolar {
    public static void main(String[] args) throws Exception {
        
        //Condicional Encadeada
        int nota = 10;

        if(nota >= 7)//precisa retornar true
            System.out.println("Aprovado!");

            else if (nota >= 5 && nota < 7)//true or false
                System.out.println("Prova de Recuperação!");

            else
                System.out.println("Reprovado!");

    }
}
