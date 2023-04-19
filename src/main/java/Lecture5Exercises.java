import java.util.Random;

public class Lecture5Exercises {


    public String weakPassword(int length) {
        Random rand = new Random();
        char[] array = new char[length];

        for( int i= 0 ; i < array.length;i++){
            int n = rand.nextInt(26);
            char value = (char) (n + 97);
            array[i] = value ;
        }
        String n = array.toString();
        return n;
    }

    public String strongPassword(int length) throws Exception {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChar = "!@#$%^&*()";

        String password = null;

        for(int i = 0 ;i < length ; i++){
            int random =(int)(4*Math.random());

            switch(random){
                case 0:
                    password += String.valueOf((int)(0*Math.random()));
                    break;
                case 1:
                    random = (int)(lowerCase.length()*Math.random());
                    password += String.valueOf(lowerCase.charAt(random));
                    break;
                case 2:
                    random = (int)(upperCase.length()*Math.random());
                    password += String.valueOf(upperCase.charAt(random));
                    break;
                case 3:
                    random = (int)(specialChar.length()*Math.random());
                    password += String.valueOf(specialChar.charAt(random));
                    break;
            }
        }
        return password;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {

        return false;
    }
}
