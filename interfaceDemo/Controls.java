package interfaceDemo;

public class Controls {
    String breaks;
    int gears;
    int seats;




    public Controls(String breaks, int gears, int seats) {
        this.breaks = breaks;
        this.gears=gears;
        this.seats=seats;
    }
    public String getBreaks() {
        return breaks;
    }
    public int getGears() {
        return gears;
    }
    public int getSeats() {
        return seats;
    }
    public String toString(){
        return breaks;
    }

}
