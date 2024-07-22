package problems.palindromeNumber;

public class PalindromeNumber {

    private Boolean solution(int x) {
        String xString = String.valueOf(x);
        String reversed = new StringBuilder(xString).reverse().toString();
        return xString.equals(reversed);
    }
}
