package fifthModule.task36;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
    }
}
