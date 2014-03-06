package appliances;

import appliances.Refrigerator.Refrigerator;
import appliances.TV.TV;
import appliances.WashingMachine.WashingMachine;

public class Main {
    public static void main(String[] args){

        Refrigerator refrigerator = new Refrigerator();
        System.out.println(refrigerator);

        WashingMachine washingMachine = new WashingMachine("IP65", "7.0", true, true, "A+++", "Embeddable");
        System.out.println(washingMachine);

        TV tv = new TV("LCD", 60 , "Sharp LC-60LE635", false, false, "A++");
        tv.On();
        System.out.println(tv);
    }
}
