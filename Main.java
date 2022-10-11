public class Main {
    public static void main(String[] args) {
        String s = "axxaaxbaaaxa"; // xa
        System.out.println(printString("abc"));
        System.out.println(reverse("abc"));
    }


    // takes a string -> return string
    public static String printString(String s) {
        // base case
        if (s.length() == 1) return s;

        // keep every character
        return s.charAt(0) + printString(s.substring(1));
        // a + result ("bc")
        // a +  b + c
    }

    public static String reverse(String s) {
        // base case
        if (s.length() == 1) return s;

        // reverse
        return reverse(s.substring(1)) + s.charAt(0);
        // reverse("bc") + a
        // c + b + a
    }


}