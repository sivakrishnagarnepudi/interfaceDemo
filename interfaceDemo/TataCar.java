package interfaceDemo;

import interfaceDemo.MyCar;

public abstract class TataCar implements MyCar {

        public abstract void carWheel();
        public abstract void carColor();
        public abstract void skyRoof();
        public  void getCar () {
            AC ac = getacPoints();
            Engine engine = getengine();
            Controls controls = getcontrols();
            carWheel();
            carColor();
            skyRoof();
            System.out.println(ac.getAcPoints());
            System.out.println(engine.getTypeofengine());
            System.out.println("car cc:" + engine.getTypeofmodel());
            System.out.println("Breakstype:" + controls.getBreaks());
            System.out.println("Number of Gears:" + controls.getGears());
            System.out.println("Number of seats:    " + controls.getSeats());

        }
        public AC getacPoints(){
            return new AC("4pointac");
        }
        public Engine getengine(){
            return new Engine("Hybrideengine","220cc");
        }
        public Controls getcontrols(){
            return new Controls("Hydraulic Brakes",6,8);
        }

    }










