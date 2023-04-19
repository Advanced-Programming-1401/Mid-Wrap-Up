public class Lecture4Exercises {

    public long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public String reverse(String word) {
        char array[] = word.toCharArray();
        String fina = "";
        for (int i = array.length - 1; i > 0; i--) {
            fina += array[i];
        }
        return fina;
    }

    public boolean isPalindrome(String line) {
        int i = 0;
        int j = line.length() - 1;
        boolean palindrome = true;
        while (i < j) {
            if (line.charAt(i) != line.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        return palindrome;
    }

    public char[][] dotPlot(String str1, String str2) {


        return null;
    }
}