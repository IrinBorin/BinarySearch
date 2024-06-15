public class Factorial {
    public static int factorialRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }
}
