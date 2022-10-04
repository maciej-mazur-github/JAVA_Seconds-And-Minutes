public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = String.valueOf(hours);
        if(hours / 10 == 0) {
            hoursString = "0" + hoursString;
        }
        hoursString += "h ";

        String minutesString = String.valueOf(remainingMinutes);
        if(remainingMinutes / 10 == 0) {
            minutesString = "0" + minutesString;
        }
        minutesString += "m ";

        String secondsString = String.valueOf(seconds);
        if(seconds / 10 == 0) {
            secondsString = "0" + secondsString;
        }
        secondsString += "s ";

        return minutes + " minutes, " + seconds + " seconds = " + hoursString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return seconds + " seconds = " + getDurationString(minutes, remainingSeconds);
    }
}
