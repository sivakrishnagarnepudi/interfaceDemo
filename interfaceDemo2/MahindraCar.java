package interfaceDemo2;

import interfaceDemo.AC;
import interfaceDemo.Controls;
import interfaceDemo.Engine;

public abstract class MahindraCar {
    public abstract void carWheel();
    public abstract void carColor();
    public  void getCar () {
        AC ac = getacPoints();
        Engine engine = getengine();
        Controls controls = getcontrols();
        carWheel();
        carColor();
        System.out.println(ac.getAcPoints());
        System.out.println(engine.getTypeofengine());
        System.out.println("car cc:" + engine.getTypeofmodel());
        System.out.println("Breakstype:" + controls.getBreaks());
        System.out.println("Number of Gears:" + controls.getGears());
        System.out.println("Number of seats:    " + controls.getSeats());

    }
    public AC getacPoints(){
        return new AC("5pointac");
    }
    public Engine getengine(){
        return new Engine("Hybrideengine","320cc");
    }
    public Controls getcontrols(){
        return new Controls("Hydraulic Brakes",6,6);
    }

}
