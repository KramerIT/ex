package appliances.WashingMachine;

public class WashingMachine extends WashingMachineClass {
    private String inslallType;
    public WashingMachine(){
        super();
        this.inslallType = "N/A";
    }
    public WashingMachine(String protectionIP, String loadCapacity, boolean state, boolean warranty, String energySaving, String inslallType){
        super(protectionIP, loadCapacity, state, warranty, energySaving);
        this.inslallType = inslallType;
    }
    public String toString(){
        return "\nType of installation: " + inslallType  + "\n" + super.toString();
    }
}
