package fifthModule.task31;

public class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
