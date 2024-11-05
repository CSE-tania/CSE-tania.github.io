package CoffeeHour;

public class Coffee {

//Tania Charles
//Coffee class that represents a single cup of coffee with instance variables and methods.


 private String name; // Name of the coffee
 private int caffeineContent; // Caffeine content in mg (between 50 and 300)

 // Default constructor
 public Coffee() {
     this.name = "none";
     this.caffeineContent = 50;
 }

 // Parameterized constructor
 public Coffee(String name, int caffeineContent) {
     this.setName(name);
     this.setCaffeineContent(caffeineContent);
 }

 // Accessor for name
 public String getName() {
     return name;
 }

 // Mutator for name
 public void setName(String name) {
     if (name != null) {
         this.name = name;
     } else {
         this.name = "none"; // Default value if null is passed
     }
 }

 // Accessor for caffeine content
 public int getCaffeineContent() {
     return caffeineContent;
 }

 // Mutator for caffeine content (only accepts values between 50 and 300)
 public void setCaffeineContent(int caffeineContent) {
     if (caffeineContent >= 50 && caffeineContent <= 300) {
         this.caffeineContent = caffeineContent;
     } else {
         this.caffeineContent = 50; // Default value if out of range
     }
 }

 // Method to calculate the number of cups before it becomes dangerous to drink more
 public double riskyAmount() {
     return 180.0 / ((this.caffeineContent / 100.0) * 6.0);
 }

 // Equals method to compare two coffee objects
 public boolean equals(Coffee other) {
     return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
 }

 // toString method to display the coffee's properties
 @Override
 public String toString() {
     return "Name: " + this.name + "\nCaffeine Amount: " + this.caffeineContent + " mg";
 }
}
