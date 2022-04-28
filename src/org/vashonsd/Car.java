package org.vashonsd;

public class Car {
    double mpg;
    double gallonsInTank;
    String model;
    int year;
    Make make;

    public enum Make {
        TOYOTA,
        TESLA,
        SUBARU
    }

    public Car(int year, Make make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public void addFuel(double howMuch) {
        gallonsInTank += howMuch;
    }

    public void useFuel(double howMuch) {
        gallonsInTank -= howMuch;
    }

    public boolean canMakeTrip(double howManyMiles) {
        return mpg * gallonsInTank > howManyMiles;
    }
}
