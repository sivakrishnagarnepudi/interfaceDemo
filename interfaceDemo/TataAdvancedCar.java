package interfaceDemo;

public class TataAdvancedCar extends TataCar {
    @Override
    public void carWheel() {
        System.out.println("Super alloy wheels");
    }

    @Override
    public void carColor() {
        System.out.println("Green");

    }
    public void skyRoof(){
        System.out.println("This Feature is Available by user");
    }
}
