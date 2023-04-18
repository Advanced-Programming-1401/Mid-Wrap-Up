public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
        }
        return temp;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long firstN = 1;
        long secondN = 1;
        long thirdN = 0;
        for (int i = 2; i < n; i++) {
            thirdN = firstN + secondN;
            firstN = secondN;
            secondN = thirdN;
        }
        if (n==1 || n==2) {return 1;}
        return thirdN;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String reversedWord = "";
        for (int i = 0; i < word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }
        return reversedWord;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        return line.replaceAll("\\s", "").equalsIgnoreCase(reverse(line.replaceAll("\\s", "")));
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
        int str1Length = str1.length();
        int str2Length = str2.length();
        char[][] dotPlot = new char[str1Length][str2Length];

        for (int i = 0; i < str1Length; i++) {
            for (int j = 0; j < str2Length; j++) {
                dotPlot[i][j] = ' ';
                if (str1.charAt(i) == str2.charAt(j)) {
                    dotPlot[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < Math.min(str1Length, str2Length); i++) {
            if (str1.charAt(i) == str2.charAt(i))
                dotPlot[i][i] = '*';
        }

        return dotPlot;
    }

}
