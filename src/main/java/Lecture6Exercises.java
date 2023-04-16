import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.util.regex.Pattern;
public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum = 0L;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        return reversedArr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int m1Rows = m1.length;
        int m2Rows = m2.length;
        int m1Cols = m1[0].length;
        int m2Cols = m2[0].length;

        if (m1Cols != m2Rows) {
            throw new RuntimeException("Matrices cannot be multiplied");
        }

        double[][] result = new double[m1Rows][m2Cols];

        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return result;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> result = new ArrayList<>();
        for (String[] arr : names) {
            List<String> innerList = new ArrayList<>(Arrays.asList(arr));
            result.add(innerList);
        }
        return result;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }
        return factors;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<>();
        String[] tokens = line.split("\\W+");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                words.add(token);
            }
        }
        return words;
    }
}
