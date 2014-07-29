package app;

import com.edu.*;
/**
 *
 * @author Devesh
 */
public class TemperatureConverter {
    
    public static void main(String args[]){
        
        ConvertTemperature temp = new ConvertTemperature();
        ConvertTemperatureSoap convertTemp = temp.getConvertTemperatureSoap();
        
        double temperature = convertTemp.convertTemp(35, TemperatureUnit.DEGREE_FAHRENHEIT, TemperatureUnit.DEGREE_CELSIUS);
        System.out.println("Converted temperature is " + temperature);
    }
}
