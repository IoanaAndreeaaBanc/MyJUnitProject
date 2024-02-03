public class ConvertorUnitatiMasura {

    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) * 5/9;
    }
    public double milesToKilometers(double miles){
        return  miles * 1.60934;
    }

    public double poundsToKilograms(double pound){
        return pound * 0.453592;
    }

    public double gallonsToLiters(double gallon){
        return gallon * 3.78541;
    }
}
