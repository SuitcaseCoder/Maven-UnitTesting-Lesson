package car;

public class Car {
    
    // fields
    private String make;
    private String model;
    private String year;
    private String color;
    private double mileage;
    private boolean isElectric;
    
    // constructor for all of it
    // created using command + constructor and select all
    public Car(
            String make, String model, String year, String color,
            double mileage, boolean isElectric
    ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }
    
    // empty constructor - so that we can make an instance so we don't
    // have to pass anything into it when we create an instance
    public Car(){}
    
    // getters and setters
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    public boolean isElectric() {
        return isElectric;
    }
    
    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
