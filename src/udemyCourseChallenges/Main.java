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

        System.out.println("Minutes and Seconds duration");
        System.out.println(MinutesSecondsDuration.getDurationString(100,2));
        System.out.println(MinutesSecondsDuration.getDurationString(150,26));
        System.out.println(MinutesSecondsDuration.getDurationString(50,26));
        System.out.println(MinutesSecondsDuration.getDurationString(-2,2));
        System.out.println(MinutesSecondsDuration.getDurationString(2,60));
        System.out.println(MinutesSecondsDuration.getDurationString(100));
        System.out.println(MinutesSecondsDuration.getDurationString(10000));
        System.out.println(MinutesSecondsDuration.getDurationString(20));
        System.out.println(MinutesSecondsDuration.getDurationString(-4));


        System.out.println("");
    }
}
