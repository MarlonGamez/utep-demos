public class Test {
    public static void main (String[] args) {
        int count = numDigits(913848352);
    }


    public static int numDigits(int n) {
        if(n <= 9) return 1;
        return numDigits(n/10) + 1;
    }

    public static String timeConversion(String s) {

        // HH:MM:SSAM
        String hour = s.substring(0,2);
        String minute = s.substring(3,5);
        String second = s.substring(3,5);

        String ampm = s.substring()

        if (ampm.equals("PM"))

        return hour + ":" + minute
    }
}