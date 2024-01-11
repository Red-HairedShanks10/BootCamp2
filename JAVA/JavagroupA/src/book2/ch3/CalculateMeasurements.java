package book2.ch3;



//create a method called calFeetAndInchesToCentimeters
//it will have two input params, use double data type ->

//validate that feet data value is >= 0
///AND
//validate that inches data value >= 0 and <= 12
//return -1 if any of the conditions result to false

//if both params are valid, then calculate how many cm are in a feet and inches
 //should results be separate for inches and feets or one value??

//OVERLOAD the calFeetandInchesToCentimeters, with one param for inches
//validate if inches value is >= 0 -> return -1 of condition is false
//otherwise calculate how many feet in inches
//call the first overloaded method  and pass the two correct values for each param
//1 inch = 2.54cm and one foot = 12 inches


public class CalculateMeasurements {
    public static void main(String[] args) {
        calFeetAndInchesToCentimeters(1,12);
    }

    public static double calFeetAndInchesToCentimeters(double feet, double inches){

        if((feet <= 0) || (inches <= 0 && inches > 12)){
            System.out.println("invalid values for inches and/or feet");
        }else {
            double feetToCentimeters =  (feet * (inches * 2.54));
          System.out.println(feetToCentimeters);
            return feetToCentimeters;
        }
        return 0;
    }

}
