package problems.scoreOfString;
public class ScoreOfString {

    public int solution(String s) {
        int length = s.length();
        var result = 0;

        for (int i = 0; i < (length-1); i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i+1);

            var absValue = Math.abs((int) currentChar - (int) nextChar);

            result += absValue;
        }

        return result;
    }
}
