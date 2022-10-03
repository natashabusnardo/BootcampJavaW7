package exercise;

public class Exercise01 {
    public static void main(String[] args) {
        String[] cidade = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima",
                         "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] temperatura = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26},
                               {-1, 31}, {-10, 35}};

        int menorTemp = 0;
        int maiorTemp = 0;

        int indiceMenor = 0;
        int indiceMaior = 0;

        for (int i = 0; i < cidade.length; i++){
            if (i == 0) {
                menorTemp = temperatura[i][0];
                maiorTemp = temperatura[i][1];
                indiceMenor = i;
                indiceMaior = i;
            }
            else {
                if(temperatura[i][0] < menorTemp){
                    menorTemp = temperatura[i][0];
                    indiceMenor = i;
                }
                if(temperatura[i][1] > maiorTemp){
                    maiorTemp = temperatura[i][1];
                    indiceMaior = i;
                }
            }
        }

        System.out.println("A temperatura mais baixa foi em " + cidade[indiceMenor] + ", com " + menorTemp + "ºC.");
        System.out.println("A temperatura mais alta foi em " + cidade[indiceMaior] + ", com " + maiorTemp + "ºC.");
    }
}
