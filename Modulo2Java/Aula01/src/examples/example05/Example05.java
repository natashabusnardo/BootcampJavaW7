package examples.example05;

public class Example05 {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = i + j;
            }
        }

        System.out.println(matriz);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
