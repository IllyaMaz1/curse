package fifthModule.task27;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));
    }
}
