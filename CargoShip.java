package shipproject;

//copyright: Tania Charles
//This class represents a Cargo Ship with attributes for tonnage and maximum speed.

public class CargoShip extends Ship {
 private double tonnage; // Measured in DWT
 private double maxSpeed; // Measured in knots

 // Constructor
 public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
     super(name, launchDate); // Call parent constructor
     this.tonnage = tonnage;
     this.maxSpeed = maxSpeed;
 }

 // Accessors and mutators for tonnage
 public double getTonnage() {
     return tonnage;
 }

 public void setTonnage(double tonnage) {
     this.tonnage = tonnage;
 }

 // Accessors and mutators for maximum speed
 public double getMaxSpeed() {
     return maxSpeed;
 }

 public void setMaxSpeed(double maxSpeed) {
     this.maxSpeed = maxSpeed;
 }

 // Override toString
 @Override
 public String toString() {
     return "Cargo Ship Name: " + getName() +
            ", Tonnage: " + tonnage + " DWT" +
            ", Max Speed: " + maxSpeed + " knots";
 }
}
