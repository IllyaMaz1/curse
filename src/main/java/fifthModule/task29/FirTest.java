package fifthModule.task29;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
        System.out.println(firTest.test(firNum, 5));
    }
}
