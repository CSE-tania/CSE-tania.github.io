//copyright Janyah Gurley
package Apple;

public class Apple {
    private String type;
    private double weight;
    private double price;

    private static final String DEFAULT_TYPE = "Gala";
    private static final double DEFAULT_WEIGHT = 0.5;
    private static final double DEFAULT_PRICE = 0.88;

    private static final String[] VALID_TYPES = {"Red Delicious", "Golden Delicious", "Gala", "Granny Smith"};

    public Apple() {
        this.type = DEFAULT_TYPE;
        this.weight = DEFAULT_WEIGHT;
        this.price = DEFAULT_PRICE;
    }

    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (isValidType(type)) {
            this.type = type;
        } else {
            System.out.println("Invalid value for type!");
            this.type = null;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0 && weight <= 2) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value for weight!");
            this.weight = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid value for price!");
            this.price = 0.0;
        }
    }

    private boolean isValidType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    public void writeOutput() {
        System.out.println("Type: " + (type == null ? "null" : type));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}
