import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long first=1;
        long secend= 1L;
        long third=1;
        if(n<=2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            third=first+secend;
            first=secend;
            secend=third;
        }
        return third;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        int len=word.length();
        String word2="";
        for(int i=len-1;i>=0;i=i-1){
            word2+=word.charAt(i);
        }

        return word2;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line=line.toLowerCase(Locale.ROOT);
        line = line.replaceAll("\\s", "");
        int len=line.length();
        String line2="";
        for(int i=len-1;i>=0;i=i-1){
            line2+=line.charAt(i);
        }
        if(line.equals(line2)){
            return true;
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
        int len1=str1.length();
        int len2=str2.length();
        char[][]array=new char[len1][len2];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    array[i][j]='*';
                }
                else {
                    array[i][j]=' ';
                }
            }
        }
        return array;
    }
}
