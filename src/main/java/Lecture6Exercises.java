import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {

        long sum=0;
        for (int i = 0 ; i<arr.length;i+=2){
           sum+=arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {

        int [] reverse = new int[arr.length];
        for (int i=arr.length-1 ; i>=0; i--){
            reverse[i]=arr[arr.length-1-i];
        }
        return reverse;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        double[][] product = new double[m1.length][m2[0].length];
        for(int i=0;i<m1.length;i++) {
            for (int j = 0; j < m2[0].length; j++) {
                product[i][j] = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return product;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {

        List<List<String>> result = new ArrayList<>();
        for (String[] i : names) {
            List<String> list = new ArrayList<>();
            for (String j : i) {
                list.add(j);
            }
            result.add(list);
        }
        return result;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {

        List<Integer> primeFactors =new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            primeFactors.add(n);
        }
        Set<Integer> set = new HashSet<>(primeFactors);
        primeFactors.clear();
        primeFactors.addAll(set);
        return primeFactors;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {

        List<String> words = new ArrayList<>();
        String[] split = line.split("[^a-zA-Z]+");
        for (String word : split) {
            if (!word.equals("")) {
                words.add(word);
            }
        }
        return words;
    }
}
