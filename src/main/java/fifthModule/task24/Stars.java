package fifthModule.task24;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    private String solutionByAlex(int count) {
        String result = "";
        result = checkThousandsValue(count) + checkHundredsValue(count) + checkDozensValue(count) + checkUnitsValue(count);
        return result;
    }


    private String checkThousandsValue(int count) {
        String result = "";
        int tempFirstValue = count / 1000;
        String CharX = "X";
        result = CharX.repeat(tempFirstValue);
        return result;
    }

    private String checkHundredsValue(int count) {
        String result = "";
        int tempSecondValue = count / 100 % 10;
        String charY = "Y";
        result += charY.repeat(tempSecondValue);
        return result;
    }

    private String checkDozensValue(int count) {
        String result = "";
        int tempThirdValue = count / 10 % 10;
        String charZ = "Z";
        result += charZ.repeat(tempThirdValue);
        return result;
    }

    private String checkUnitsValue(int count) {
        String result = "";
        int tempFourthValue = count % 10;
        String charStar = "*";
        result += charStar.repeat(tempFourthValue);
        return result;
    }

    private String solutionByIllya(int count) {
        String result = "";
        int thousands = count / 1000;
        int hundred = count % 1000 / 100;
        int dozens = count % 100 / 10;
        int units = count % 10;
        result += "X".repeat(thousands) + "Y".repeat(hundred) + "Z".repeat(dozens) + "*".repeat(units);
        return result;
    }


    @Override
    public String toString() {
        return solutionByIllya(getCount());
    }

}
