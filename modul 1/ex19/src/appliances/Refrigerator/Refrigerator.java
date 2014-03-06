package appliances.Refrigerator;

public class Refrigerator extends RefrigeratorClass {
    private String color;
    public Refrigerator(){
        super();
        color = "N/A";
    }
    public Refrigerator(boolean state, boolean warranty, String energySaving, String noiseLevel, String color){
        super(state, warranty, energySaving, noiseLevel);
        this.color = color;
    }
    public String toString(){
        return "\nColor: " + color +"\n" + super.toString();
    }

}
