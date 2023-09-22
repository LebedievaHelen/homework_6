public class Palindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(s);
        String invertS = String.valueOf(strBuilder.reverse());
        return s.equalsIgnoreCase(invertS);
    }
}
