package Chapter2;

public class CompareString {
    public static void main(String args[]) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        String s4 = "bcd";

        // Compare using equals()
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        // Compare ignoring case
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("s1 == s3 when ignoring case");
        } else {
            System.out.println("s1 != s3 when ignoring case");
        }

        // Compare using compareTo()
        if (s1.compareTo(s4) < 0) {
            System.out.println("s1 < s4");
        } else if (s1.compareTo(s4) == 0) {
            System.out.println("s1 == s4");
        } else if (s1.compareTo(s4) > 0) {
            System.out.println("s1 > s4");
        }
    }
}

