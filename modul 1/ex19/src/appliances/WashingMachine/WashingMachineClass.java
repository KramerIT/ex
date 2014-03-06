package appliances.WashingMachine;

import appliances.HouseHold.HouseholdAppliances;

public class WashingMachineClass extends HouseholdAppliances {
    private String protectionIP;
    private String loadCapacity;
    protected WashingMachineClass(){
        super();
        protectionIP = "N/A";
        loadCapacity = "N/A";
    }
    protected WashingMachineClass(String protectionIP, String loadCapacity,
                        boolean state, boolean warranty, String energySaving){
        super(state, warranty, energySaving);
        this.protectionIP = protectionIP;
        this.loadCapacity = loadCapacity;
    }
    protected String getInfo(){
        return  "Protection IP: " + protectionIP + "\n" + "Load capacity: " + loadCapacity + " liter "
                + "\n" + getEnergySaving() + "\n" + powerSypply + "\n" + getWarranty() + "\n" + getState();
    }
    public  String toString(){
        return getInfo();
    }
}
