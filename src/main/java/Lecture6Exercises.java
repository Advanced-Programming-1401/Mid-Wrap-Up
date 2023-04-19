import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    public long calculateEvenSum(int[] arr) {
        int i = 0;
        int sum = 0;
        while(i < arr.length){
            int a = arr[i];
            sum += a ;
            i += 2;
        }
        return sum ;
    }


    public int[] reverseArray(int[] arr) {
        int[] arr1 = null;
        for( int i = 0 ; i < arr.length/2 ;i++) {
            arr1[i] = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1 - i] = arr1[i];
        }
        return arr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {


        return null;
    }


    public List<List<String>> arrayToList(String[][] names) {
        int n = 20;
        List<List<String>> second = new ArrayList<List<String>>();
        List<String> x = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            for( int j = 0; j < n;j++){
            x.add(names[i][j]);
            }
        }
        second.add(x);
        return second;
    }

    public List<Integer> primeFactors(int n) {
        List<Integer> hi = new ArrayList<Integer>();
        double x ,y;
        int counter = 0;
       for ( int i = 1 ; i <= n;i++){
           for(int j = 0; j<i ;j++){
               x = i/j;
               if(Math.floor(x)==x){
                   counter++;
               }
           }
           if(counter==2){
               y = n / i;
               if(Math.floor(y) ==y){
                   int z = (int)y;
                   hi.add(z);
               }
           }
       }
        return hi;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> line2 = new ArrayList<>();
        String[] line1 = line.split("//s+");
        for(int i = 0; i < line1.length; i++){
            line1[i] = line1[i].replaceAll("[^\\w]", "");
            line2.add(line1[i]);
        }
        return line2;
    }
}
