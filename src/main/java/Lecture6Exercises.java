import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum = 0;
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
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            reversedArray[arr.length-1-i] = arr[i];
        }
        return reversedArray;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] matrixProduct = new double[m1.length][m2[0].length];
        if (m1[0].length != m2.length) {
            throw new RuntimeException();
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                matrixProduct[i][j] = sum;
            }
        }
        return matrixProduct;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> arrayToList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            ArrayList<String> aL = new ArrayList<>();
            for (int j = 0; j < names[i].length; j++) {
                aL.add(names[i][j]);
            }
            arrayToList.add(aL);
        }
        return arrayToList;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> primeFactorsOfInt = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0 && isPrime(i)) {
                primeFactorsOfInt.add(i);
            } 
        }
        return primeFactorsOfInt;
    }

    public boolean isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) 
                counter++;
        }
        return counter == 2;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> extractedWords = new ArrayList<>();
        for (String word: line.replaceAll("[^a-zA-Z1-9]", " ").split("\\s+"))
            extractedWords.add(word);
        
        return extractedWords;
    }
}
