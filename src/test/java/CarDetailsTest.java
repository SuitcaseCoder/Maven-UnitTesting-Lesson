import car.Car;
import car.CarUtils;
import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTest {
    
    // naming for unit tests __ method name_what are the inputs_ what do
    // you expect to happen
    @Test
    public void getCarDetails_givenValidCar_returnsExpectedString(){
       //arrange
        Car car= new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        
        //act
        String details = CarUtils.getCarDetails(car);
        
        // assert
        Assert.assertEquals("2019 Ford Mustang", details);
    }
    
    @Test
    public void getCarDetails_GivenNullValues_ReturnErrorString(){
        //arrange
        Car car= new Car();
    
        //act
        String details = CarUtils.getCarDetails(car);
    
        //assert
        Assert.assertEquals("not able to provide details", details);
    }
    
    @Test
    public void getCarDetails_GivenOneNullValue_ReturnErrorString(){
        //arrange
        Car car= new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        // we did not set the year
        
        //act
        String details = CarUtils.getCarDetails(car);
        
        //assert
        Assert.assertEquals("not able to provide details", details);
    }
    
    @Test
    public void getCarDetails_GivenTwoValues_ReturnErrorString(){
        //arrange
        Car car= new Car();
        car.setMake("Ford");
        //we did not set the model nor year
        
        //act
        String details = CarUtils.getCarDetails(car);
        
        //assert
        Assert.assertEquals("not able to provide details", details);
    }
    
}
