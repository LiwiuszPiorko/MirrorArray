import java.util.Random;
import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random numbers = new Random();

        for (int i = 0; i < 10; i++) {
            tablica[i] = numbers.nextInt(10);

            for (i = 0; i < tablica.length * 2; i++){

                if (i < tablica.length) {
                } else {
                    int index = 2 * tablica.length - i - 1;
                    System.out.print(tablica[index]+ ", ");
                }
            }
        }
        String tablicaC = Arrays.toString(tablica).replace("[","").replace("]","");
        System.out.println(tablicaC);
    }
}
