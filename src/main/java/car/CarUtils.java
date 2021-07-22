package car;


public class CarUtils {
    
    // filled with static methods
    
    // passing in a car object
    // will return a string with details about the car being passed in
    public static String getCarDetails(Car car){
        
//        String make = car.getMake();
//        String model = car.getModel();
//        String year = car.getYear();
        
        if(car.getMake() == null || car.getModel() == null || car.getYear() == null){
            return "not able to provide details";
        }
        
        return car.getYear() + " " + car.getMake() + " " + car.getModel();
        
    };
}
