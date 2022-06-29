package drinks;

public class Coffee {

    private double milkMeasurement;
    private double coffeeBeanMeasurement;
    private double sugarMeasurement;

    public Coffee(double milkMeasurement, double coffeeBeanMeasurement, double sugarMeasurement) {
        this.milkMeasurement = milkMeasurement;
        this.coffeeBeanMeasurement = coffeeBeanMeasurement;
        this.sugarMeasurement = sugarMeasurement;
    }

    @Override
    public String toString() {
        return "coffee with " +
                coffeeBeanMeasurement + "  kg of coffee beans " +
                "and " + milkMeasurement + " l of milk " +
                "and " + sugarMeasurement +  " kg of sugar "+
                "and extra dark!";
    }
}
