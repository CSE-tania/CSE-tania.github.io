package fleetofvehicles;

//copyright: Tania Charles

public class Car extends Vehicle {
    private double gasMileage; // gallons
    private int passengers; // number of passengers

    // Default constructor
    public Car() {
        super();
        this.gasMileage = 0.0;
        this.passengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturer, int cylinders, String owner, double gasMileage, int passengers) {
        super(manufacturer, cylinders, owner);
        setGasMileage(gasMileage);
        setPassengers(passengers);
    }

    // Accessors and mutators
    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            throw new IllegalArgumentException("Gas mileage must be non-negative.");
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers >= 0) {
            this.passengers = passengers;
        } else {
            throw new IllegalArgumentException("Number of passengers must be non-negative.");
        }
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
               passengers == car.passengers;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Gas Mileage=" + gasMileage + " gallons, Passengers=" + passengers;
    }
}
