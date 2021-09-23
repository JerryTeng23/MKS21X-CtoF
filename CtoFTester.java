public class CtoFTester{

  /* The first function should have the degrees, in Celsius, as the parameter, and
     return the equivalent degrees in Fahrenheit. The latter function should switch
     parameter and what it returns. To help with accuracy, it is helpful for the parameters
     to be a double, so they are accurate when being multipled by 5/9 or 9/5.
  */
  public static double celsiusToFahrenheit(double Celsius1){
    double Fahrenheit1 = (Celsisu1 * 9/5) + 32;
    return Fahrenheit1;
  }

  public static double fahrenheitToCelsius(double Fahrenheit2){
    double Celsius2 = (Fahrenheit2 - 32) * 5/9;
    return Celsius2;
  }

  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit);
    System.out.println(fahrenheitToCelsius);
  }
}
