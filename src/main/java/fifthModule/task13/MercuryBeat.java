package fifthModule.task13;

public class MercuryBeat extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return passengerCount * 15;
    }
}
