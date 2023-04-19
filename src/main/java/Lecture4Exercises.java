public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String formatted = line.replaceAll("\\s+","").toLowerCase();
        return formatted.equals(reverse(formatted));
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   a   *
     *   l       *
     *   i         *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        char[][] dotPlot = new char[len2][len1];
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    dotPlot[i][j] = '*';
                } else {
                    dotPlot[i][j] = ' ';
                }
            }
        }
        return dotPlot;
    }

}
