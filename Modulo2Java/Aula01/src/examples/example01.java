package examples;

public class example01 {
    public static void main(String[] args) {
        int numeroInteiro;
        double numeroDouble;

        numeroInteiro = 12;
        numeroDouble = 4.99999;

        // narrowing casting
        numeroInteiro = (int) numeroDouble;

        System.out.println("Resposta = " + numeroInteiro);
        System.out.println(numeroDouble);

        numeroDouble = (3 + 5) * 2;

        System.out.println(numeroDouble);
    }
}
