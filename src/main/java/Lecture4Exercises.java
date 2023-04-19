import java.util.ArrayList;
import java.util.List;

public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {

        long fac = 1;
        for (int i=1 ; i<=n ; i++){
            fac*=i;
        }
        return fac;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {

        long f1 = 1;
        long f2 = 1;
        long temp = 0;
        if (n == 1)
            return f1;
        if (n == 1)
            return f2;
        for (int i = 0; i < n-2; i++){
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {

        String reverse = "";
        for (int i = word.length()-1 ; i >=0; i--){
            reverse+=word.charAt(i);
        }
        return reverse;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {

        String reverse="";
        line=line.replaceAll("\\s", "");
        line=line.toLowerCase();
        for (int i = line.length()-1 ; i >=0; i--){
            reverse+=line.charAt(i);
        }
        if (line.equals(reverse)){
            return true;
        }
        else {
            return false;
        }
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

        char[][] dotPlot = new char[str1.length()][str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dotPlot[i][j] = '*';
                }

                else {
                    dotPlot[i][j] = ' ';
                }
            }
        }
        return dotPlot;
    }
}
