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
    
    // TODO: In CarUtils, write a static void method called
    //  convertToElectric. It takes in a car object and a String
    //  'engineType.' If the string includes the word 'electric' anywhere
    //  inside, then set the car's isElectric value to be true. You will
    //  use setElectric() to do that. Then, write a test following
    //  Arrange/Act/Assert which tests convertToElectric on whether the car's isElectric field was set when 'electric' is present in the engineType string. Then, write a test to make sure that convertToElectric will set the car's isElectric field regardless of how the string with 'electric' is capitalized. For BOTH of these tests, you will use assertTrue or assertFalse to see if car.isElectric is true or false. Be sure to look at the curriculum on how to use those methods!
}
