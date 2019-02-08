import java.util.Random;
public class Generador {

    public static void main(String[] args) {
        int[] ndigitos = new int[10];
        int n;

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            ndigitos[i] = 0;
        }
        for (long i=0; i < 100000L; i++) {
            n = (int)(rnd.nextDouble() * 10.0);
            ndigitos[n]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+": " + ndigitos[i]);
        }

    }
}





