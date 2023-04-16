import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i]
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {

        int[] reverse = new int[arr.length];

        int save = arr.length;

        for(int i = 0 ; i <arr.length ; i++){

            reverse[save - 1] = arr[i];
            save -= 1;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(reverse[i]);
        }

        return null;
    }
    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public void matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        int m = m1.length;
        int n = m1[0].length;
        int q = m2[0].length;

        int multi[][] = new int[n][q];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < q ; j++) {

                multi[i][j] = 0;
                for(int k = 0 ; k < m ; k++){

                    multi[i][j]+=m1[i][k]*m2[k][j];

                }
                System.out.print(multi[i][j]+" ");
            }

            System.out.println();
        }
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {

        List<List<String>> List = new ArrayList();

        for (String[] mArray : names) {
            ArrayList<String> mList = new ArrayList<>(Arrays.asList(mArray));
            List.add(mList);
        }
        return List;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {

        List<Integer> lists = new ArrayList<Integer>();
        while (n % 2 == 0) {
            lists.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                lists.add(i);
                n /= i;
            }
        }
        if (n > 2){
            lists.add(n);
        }
        return lists;

    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {

        String[] words = word.split("\\W+");
        return  Arrays.toString(words);

    }
}
