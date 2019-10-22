package udemyCourseChallenges;

public class Main {
    public static void main(String[] args) {
        System.out.println("Speed Converter:");
        double test = SpeedConverter.toMilesPerHour(10);
        System.out.println(test);
        SpeedConverter.printConversion(10);
        System.out.println("");

        System.out.println("Mega Bytes Converter:");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-50);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.out.println("");

        System.out.println("Barking Dog:");
        System.out.println(BarkingDog.shouldWakeUp(true,1));
        System.out.println(BarkingDog.shouldWakeUp(false,1));
        System.out.println(BarkingDog.shouldWakeUp(false,2));
        System.out.println(BarkingDog.shouldWakeUp(true,8));
        System.out.println(BarkingDog.shouldWakeUp(true,-1));
        System.out.println("");

        System.out.println("Leap year calculator:");
        System.out.println(LeapYearCalculator.isLeapYear(1700));
        System.out.println(LeapYearCalculator.isLeapYear(-5));
        System.out.println(LeapYearCalculator.isLeapYear(99999));
        System.out.println(LeapYearCalculator.isLeapYear(1924));
        System.out.println(LeapYearCalculator.isLeapYear(1800));
        System.out.println(LeapYearCalculator.isLeapYear(2600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println("");
    }
}
