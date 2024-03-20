package fifthModule.task37;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();

    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
    }
}
