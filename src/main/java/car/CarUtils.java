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
    
    // TODO: Update the CarUtils.getCarDetails method to now include the color of the car in its returned string. Then run your tests again and update the tests as needed
    
    // TODO: In CarUtils, write a static void method called addToMileage
    //  . This method takes in a car object and a double 'mileageToAdd'. The method will set the car's mileage to be equal to the current mileage + the mileageToAdDThen, write a test, following Arrange/Act/Assert which tests whether the new mileage was correctly added. You will probably call car.getMileage in your assertion and compare it to what you expect.
    
}
