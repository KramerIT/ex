package appliances.HouseHold;

public class HouseholdAppliances extends Appliances {
    protected boolean state;
    protected boolean warranty;
    protected String energySaving;
    protected HouseholdAppliances (){
        state = false; warranty = false; energySaving = "N/A";
    }
    protected HouseholdAppliances (boolean state, boolean warranty, String energySaving){
        this.state = state;
        this.warranty = warranty;
        this.energySaving = energySaving;
    }
    public void On(){state = true;}
    public void Of(){state = false;}
    public String getState(){
        if (state){
            return "Device is switched on";
        }
        else {
            return "Device is switched off";
        }
    }
    public void setWarranty(boolean w){
        if (w){
            warranty = true;
        }
        else {
            warranty = false;
        }
    }
    public String getWarranty(){
        if (warranty){
            return "Device is  on warranty";
        }
        else {
            return "Device is not warranty";
        }
    }
    public void setEnergySaving(String e){
        energySaving = e;
    }
    public String getEnergySaving(){
        return "Energysaving class: " + energySaving;
    }
    public  String toString(){
       return getEnergySaving() + "\n" + powerSypply + "\n" + getWarranty() + "\n" + getState();
    }
}
