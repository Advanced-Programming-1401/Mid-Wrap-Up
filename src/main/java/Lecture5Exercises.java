import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String password = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 97);
            password += c;
        }
        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        String password = "";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        String digits = "0123456789";
        Random random = new Random();
        int nLetters = random.nextInt(length -2) + 1;
        int nSpecialCharacters = random.nextInt(length - nLetters - 1) + 1;
        int nDigits = length - nLetters - nSpecialCharacters;
        if (length <= 2)
            throw new Exception("Length must be greater then 2.");
        
        for (int i = 0; i < nLetters; i++) {
            password += (char) (random.nextInt(26) + 'a');
        }

        for (int i = 0; i < nSpecialCharacters; i++) {
            password += specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        }

        for (int i = 0; i < nDigits; i++) {
            password += digits.charAt(random.nextInt(digits.length()));
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
        for (int i = 0; i < n; i++) {
            if (n == fibonacci(i) + Long.bitCount(fibonacci(i))) {
                return true;
            }
        }
        return false;
    }

    public long fibonacci(int n) {
        long firstN = 1;
        long secondN = 1;
        long thirdN = 0;
        for (int i = 2; i < n; i++) {
            thirdN = firstN + secondN;
            firstN = secondN;
            secondN = thirdN;
        }
        if (n==1 || n==2) {return 1;}
        return thirdN;
    }

    // I have also created a method to count ones in binary format in another way but it's not needed:

    public int onesCounter(int n) {
        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }
    
}
