package org.vashonsd;

public class Main {

    public static void main(String[] args) {
	    Car c = new Car(2000, Car.Make.TOYOTA, "Celica");
        c.addFuel(8);
        c.setMpg(28);
        System.out.println(c.canMakeTrip(240));
        Car i = new Car(2021, Car.Make.SUBARU, "Impreza");
        i.addFuel(6.8);
        i.setMpg(26.4);
        System.out.println(i.canMakeTrip(10));
    }
}
