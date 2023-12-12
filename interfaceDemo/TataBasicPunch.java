package interfaceDemo;

public class TataBasicPunch extends TataCar {
    @Override
    public void carWheel() {
        System.out.println("alloy wheels");

    }

    @Override
    public void carColor() {
        System.out.println("Red color car");

    }

    @Override
    public void skyRoof() {
        System.out.println("Basic Model is not available SkyRoof");
    }
}
