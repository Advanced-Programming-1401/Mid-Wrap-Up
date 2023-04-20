import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        int length= arr.length;
        long answer=0;
        for(int i=0;i<length;i=i+2){
            answer+=arr[i];
        }
        return answer;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int length=arr.length;
        int[]arr2=new int[length];
        for(int i=0;i<length;i++){
            arr2[i]=arr[length-1-i];
        }

        return arr2;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][]answer=new double[1][1];
        answer[0][0]= (m1[0][0]*m2[0][0]+m1[0][1]*m2[1][0]);
        return answer;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> answer=new ArrayList<>();
        for(String[] x : names){
            List<String> parts=new ArrayList<>();
            for (String i:x){
                parts.add(i);

            }
            answer.add(parts);
        }
        return answer;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> answer=new ArrayList<>();
        for (int i=2;i<=n;i++){
            if(n%i==0){
                boolean test=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        test=false;
                    }
                }
                if(test){
                    answer.add(i);
                }
            }
        }
        return answer;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        String[] firstStep= line.split("[^a-zA-Z]+");
        List<String> answer=new ArrayList<>();
        for (String i:firstStep){
            if(!i.equals("")){
                answer.add(i);
            }
        }
        return answer;
    }
}
