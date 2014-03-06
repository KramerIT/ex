package appliances.HouseHold;

abstract public class Appliances {
    abstract void On();
    abstract void Of();
    abstract String getState();
    public static final String powerSypply = "Power supply: 220V/50Hz";
}
