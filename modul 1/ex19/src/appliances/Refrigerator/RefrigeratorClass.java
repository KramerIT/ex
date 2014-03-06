package appliances.Refrigerator;

import appliances.HouseHold.HouseholdAppliances;

public class RefrigeratorClass extends HouseholdAppliances {
    private String noiseLevel;
    protected RefrigeratorClass(){
        super();
        noiseLevel = "N/A";
    }
    protected RefrigeratorClass(boolean state, boolean warranty, String energySaving, String noiseLevel){
        super(state, warranty, energySaving);
        this.noiseLevel = noiseLevel;
    }
    public String toString(){
        return  "Noise level: " + noiseLevel + " dB\n" + super.toString();
    }
}
