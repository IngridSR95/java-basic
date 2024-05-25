package estruturarepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;// exclui o 3
                //break; para no 3 ent só imprime 1 2

            System.out.println(numero);

        }
    }
}
