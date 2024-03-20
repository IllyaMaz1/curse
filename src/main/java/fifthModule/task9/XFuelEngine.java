package fifthModule.task9;

public class XFuelEngine extends Engine {
    protected String serialNumber;
    @Override
    public String getFuelType() {
        return "XFuel";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
