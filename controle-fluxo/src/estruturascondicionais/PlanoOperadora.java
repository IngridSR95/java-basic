package estruturascondicionais;
public class PlanoOperadora {
    
    public static void main(String[] args) {

        //um caso que se aplica melhor no switch case para que o código fique mais curto
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
