package appliances.TV;

public class TV extends TvClass {
    private String screenType;
    public TV(){
        super();
        screenType = "N/A";
    }
    public TV(String screenType, int diagonal, String model, boolean state, boolean warranty, String energySaving){
        super(diagonal, model, state, warranty, energySaving);
        this.screenType = screenType;
    }
    public String toString(){
        return "\nScreen type: " + screenType + "\n" + super.toString();
    }
}
