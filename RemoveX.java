public class RemoveX {
    public static void main(String[] args) {
        System.out.print(removeXs("xjjxxxxjxxxjxjxxjx"));
    }

    public static String removeXs(String s) {
        if (s.length() == 0) {
            return s;
        }
        else if (s.length() >= 2 && s.charAt(0) == 'x' && s.charAt(1) == 'x') {
            String newStr = helper(s.substring(1));
            return s.charAt(0) + removeXs(newStr);

        }
        else if (s.charAt(0) == 'x') {
            return removeXs(s.substring(1));
        }
        else return s.charAt(0) + removeXs(s.substring(1));
    }

    public static String helper(String s) {
        if (s.length() == 0) {
            return s;
        }
        else if (s.charAt(0) == 'x') {
            return helper(s.substring(1));
        }
        else return s;
    }
}
