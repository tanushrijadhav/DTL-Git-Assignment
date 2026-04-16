class NumberUtils {
    static int factorial(int n) {
        int res = 1;
        for(int i=1;i<=n;i++) res *= i;
        return res;
    }

    static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i<n;i++)
            if(n%i==0) return false;
        return true;
    }
}