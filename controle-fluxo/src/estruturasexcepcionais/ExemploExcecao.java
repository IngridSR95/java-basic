package estruturasexcepcionais;

import java.text.ParseException;
import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
       // tentando converter "a1.75" para um número
        Number valor;
        try{
           valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
}
