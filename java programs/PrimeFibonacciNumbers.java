public class PrimeFibonacciNumbers {
    public static void main(String[] args) {
        int maxLimit = 100000;

        // Sieve of Eratosthenes to find primes up to maxLimit
        boolean[] isPrime = new boolean[maxLimit + 1];
        for (int i = 2; i <= maxLimit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= maxLimit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxLimit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Generate Fibonacci numbers up to maxLimit
        int[] fibonacciNumbers = new int[maxLimit];
        int index = 0;
        int a = 0, b = 1;
        while (b <= maxLimit) {
            fibonacciNumbers[index++] = b;
            int temp = a;
            a = b;
            b = temp + b;
        }

        // Print prime Fibonacci numbers
        System.out.println("Prime Fibonacci numbers below " + maxLimit + ":");
        for (int i = 0; i < index; i++) {
            if (isPrime[fibonacciNumbers[i]]) {
                System.out.print(fibonacciNumbers[i] + " ");
            }
        }
    }
}
