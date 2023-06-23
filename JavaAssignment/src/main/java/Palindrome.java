// Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//Input: Civic
//Output: true
//Input: One
//Output: false


class Palindrome {
    public static boolean isPalindrome(String str)
    {
        String rev = "";

        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String str = "Civic";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}

