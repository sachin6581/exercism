import java.util.ArrayList;
import java.util.List;

class Sieve {
    private int maxPrime;
    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        boolean[] notPrimes = new boolean[maxPrime + 1];
        List<Integer> primeValues = new ArrayList<>();
        for(int i = 2; i*i <= maxPrime ; i++){
            if(!notPrimes[i]) {
                for (int j = i+i; j <= maxPrime; j += i) {
                    notPrimes[j] = true;
                }
            }
        }
        for(int j = 2;j<=maxPrime;j++){
            if(!notPrimes[j])
                primeValues.add(j);
        }
        return primeValues;
    }
}
