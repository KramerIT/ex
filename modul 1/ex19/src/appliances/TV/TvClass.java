package appliances.TV;

import appliances.HouseHold.HouseholdAppliances;

public class TvClass extends HouseholdAppliances {
    private int diagonal;
    private String model;
    protected TvClass(){
        super();
        diagonal = 0;
        model = "N/A";
    }
    protected TvClass(int diagonal, String model, boolean state, boolean warranty, String energySaving){
        super(state, warranty, energySaving);
        this.diagonal = diagonal;
        this.model = model;
    }
    public String toString(){
        return "Model: " + model + "\n" + "Diagonal: " + diagonal + " inch\n"
                + super.toString();
    }
}
