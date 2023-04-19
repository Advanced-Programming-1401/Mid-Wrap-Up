import java.security.SecureRandom;

public class Lecture5Exercises {


    private static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/";

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(LOWER_CASE_LETTERS.charAt(random.nextInt(LOWER_CASE_LETTERS.length())));
        }
        return password.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if (length < 3) {
            throw new Exception("Password length should be at least 3");
        }
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        int digitPosition = random.nextInt(length);
        int specialCharPosition = random.nextInt(length);
        while (specialCharPosition == digitPosition) {
            specialCharPosition = random.nextInt(length);
        }
        for (int i = 0; i < length; i++) {
            if (i == digitPosition) {
                password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
            } else if (i == specialCharPosition) {
                password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));
            } else {
                password.append(LOWER_CASE_LETTERS.charAt(random.nextInt(LOWER_CASE_LETTERS.length())));
            }
        }
        return password.toString();
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
        int i = 0;
        int fib = 1;
        int fibBin = Integer.bitCount(1);
        while (fib + fibBin <= n) {
            i++;
            int temp = fib + fibBin;
            fibBin = Integer.bitCount(fib);
            fib = temp;
        }
        return n == fib + fibBin;
    }
}