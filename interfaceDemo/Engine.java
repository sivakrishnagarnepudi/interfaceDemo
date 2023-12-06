package interfaceDemo;

public class Engine {
    String typeofengine;
    String typeofmodel;



    public Engine(String typeofengine, String typeofmodel) {
        this.typeofengine = typeofengine;
        this.typeofmodel=typeofmodel;
    }
    public String getTypeofengine() {
        return typeofengine;
    }
    public String getTypeofmodel() {
        return typeofmodel;
    }
    public String toString(){
        return typeofengine+","+typeofmodel;
    }

}
