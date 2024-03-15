package fifthModule.task31;

public class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int summa = 0;
        for (int i = 0; i <= n; i++) {
            summa += i;
        }
        return summa;
    }

}
