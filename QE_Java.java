public class Palindrome {
    public static boolean isPalindrome(String word) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int a = 0;
        int b = word.length() - 1;
        char[] wordArr = word.toLowerCase().toCharArray();
        while (b > a) {
            if (wordArr[a] != wordArr[b]) {
                return false;
            }
            ++a;
            --b;
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
