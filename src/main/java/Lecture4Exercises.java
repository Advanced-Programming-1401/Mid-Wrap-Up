public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 1;
        long prevFib = 1;
        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String lowercaseLine = line.toLowerCase(); // convert to lowercase for case-insensitive comparison
        int i = 0; // start from the beginning of the string
        int j = lowercaseLine.length() - 1; // start from the end of the string
        while (i < j) { // while there are still characters to compare
            // skip non-alphanumeric characters from the beginning of the string
            while (i < j && !Character.isLetterOrDigit(lowercaseLine.charAt(i))) {
                i++;
            }
            // skip non-alphanumeric characters from the end of the string
            while (i < j && !Character.isLetterOrDigit(lowercaseLine.charAt(j))) {
                j--;
            }
            // compare the current characters (ignoring case)
            if (Character.toLowerCase(lowercaseLine.charAt(i)) != Character.toLowerCase(lowercaseLine.charAt(j))) {
                return false; // not a palindrome
            }
            i++; // move to the next character from the beginning
            j--; // move to the next character from the end
        }
        return true; // palindrome
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        char[][] matrix = new char[len1][len2]; // create a 2D character array to store the dot matrix
        // initialize the matrix with spaces
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                matrix[i][j] = ' ';
            }
        }
        // fill the matrix with dots for matching characters
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    matrix[i][j] = '*';
                }
            }
        }
        return matrix; // return the dot matrix

    }
}
