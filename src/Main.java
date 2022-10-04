public class Main {
    public static void main(String[] args) {
        System.out.println(SecondsAndMinutes.getDurationString(30, 45));
        System.out.println(SecondsAndMinutes.getDurationString(30, -45));
        System.out.println(SecondsAndMinutes.getDurationString(62, 23));
        System.out.println("****************************************");
        System.out.println(SecondsAndMinutes.getDurationString(30));
        System.out.println(SecondsAndMinutes.getDurationString(-30));
        System.out.println(SecondsAndMinutes.getDurationString(3600));
        System.out.println(SecondsAndMinutes.getDurationString(3680));
    }
}
