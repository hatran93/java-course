package udemyCourseChallenges;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        String stringNum1 = Double.toString(num1);
        String stringNum2 = Double.toString(num2);


        if(num1 == num2){

            return true;
        } else return false;
    }
}
