public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int ans = 1;
        for (int i = n  ; i > 0 ; i-- ){
            ans *= i;
        }
        return ans;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if(n == 1 || n ==2){
            return 1;
        }
        else{
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {

        String reverse="";
        char changer;

        for (int i=0; i<word.length(); i++)
        {
            changer = word.charAt(i);
            reverse= changer+reverse;
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
        if(reverse(line) == line) {
            return  true;
        }
        return false;
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
        
        return null;
    }
}
