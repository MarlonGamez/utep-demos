public class RemoveA {
    public static void main(String[] args) {
        System.out.println(removeAs("aaassasasaaababaa")); // assssabba
    }

    public static String removeAs(String s) {
        // Base case
        if (s.length() == 0) {
            return s;
        }

        // Recursive call
        // if character is an 'a', exclude it
        if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
            // recursive
            return s.charAt(0) + removeAs(aHelper(s.substring(1)));
            // string.substring(1) will give us everything after our first char
        }
        if (s.charAt(0) == 'a' && s.charAt(1) != 'a') {
            return removeAs(s.substring(1));
        }

        // otherwise, keep char
        //recursive
        return s.charAt(0) + removeAs(s.substring(1));
    }

    public static String aHelper(String s) {
        if (s.length() == 0 || s.charAt(0) != 'a') return s;

        return aHelper(s.substring(1));
    }
}