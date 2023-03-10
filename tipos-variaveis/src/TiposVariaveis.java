public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //variáveis
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 10;
        numero = 11;

        System.out.println(numero);

        //constante
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
