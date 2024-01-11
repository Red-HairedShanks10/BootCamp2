package book2.ch3;

/*Speed Converter method
* we write a method called toMilePerHour() with single param of type double called kmPerHour
* it needs to return a  rounded value of type long from the calculations of type long
* we check if the kmPerHour value is less than zero then it will be an invalid value
* and we return -1 for the invalid input
* but if the number is valid, then we convert the kmPerHour to milesPerHour and return the result
* */


public class SpeedConverter {
    public static void main(String[] args) {
        double kmPerHour = 10.25;
        System.out.println(kmPerHour + " km/h is " + toMilesPerHour(kmPerHour) + " miles per hour ");
        printConversion(3.4);
        printConversion(75.144);

    }

    public static long toMilesPerHour(double kilometresPerHour) {

        if (kilometresPerHour < 0) {
            return -1;
        } else {
            //different ways to return:

            long kmToMilesPerHour;
            return  kmToMilesPerHour = Math.round(kilometresPerHour / 1.609);
            //return kmToMilesPerHour
           // return  Math.round(kilometresPerHour / 1.609);
        }
    }


    
        //we do the same thing here but with a void method / or we call the toMilesPerHour
        public static void printConversion(double kilometresPerHour){
           /* if (kilometresPerHour < 0){
                System.out.println("invalid input");
            }else {
                int kmToMilesPerHour = (int) Math.round(kilometresPerHour * 0.621427);
                System.out.println( kilometresPerHour + " km/h is " + kmToMilesPerHour + " mi/h");
            }*/
         long kmToMilesPerHour  =  toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + " km/h is " + kmToMilesPerHour + " mi/h");
        }

}
