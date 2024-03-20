package fifthModule.task29;

public class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int summa = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                summa *= i;
            }
        }
        return summa;
    }
}
