import java.security.SecureRandom;
import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            password.append(c);
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
            throw new Exception("Password length must be at least 3");
        }
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        int numDigits = 0;
        int numSpecialChars = 0;
        while (password.length() < length) {
            int randInt = random.nextInt(94) + 33;
            char c = (char) randInt;
            if (Character.isDigit(c) && numDigits < 1) {
                password.append(c);
                numDigits++;
            } else if (!Character.isLetterOrDigit(c) && numSpecialChars < 1) {
                password.append(c);
                numSpecialChars++;
            } else if (Character.isLetter(c)) {
                password.append(c);
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
        int fib1 = 0;
        int fib2 = 1;
        while (fib2 <= n) {
            int ones = Integer.bitCount(fib2);
            if (n == fib2 + ones) {
                return true;
            }
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return false;
    }
}
