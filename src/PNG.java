import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class PNG {

    public static void main(String[] args) {

        System.out.print("Primes: " + genPrimeNumbers(80, 100));
    }

    static List<Long> genPrimeNumbers(long startPrime, long endPrime) {
        List<Long> primes = new ArrayList<>();
        while (startPrime <= endPrime) {

            if (startPrime == 2 || startPrime == 3 || startPrime == 5 || startPrime == 7) {
                primes.add(startPrime);
            }

            if ((startPrime % 2 != 0) && (startPrime % 3 != 0) && (startPrime % 5 != 0) && (startPrime % 7 != 0)) {
                primes.add(startPrime);
            }
            // increment start prime anyways
            startPrime++;
        }

        return primes;
    }
}
