import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {

        Random random = new Random();
        String letters = "qwertyuiopasdfghjklzxcvbnm";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = letters.charAt(random.nextInt(letters.length()));
        }
        String finalPass=  new String(password);
        return finalPass;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        String letters ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String numbers ="0123456789";
        String specialchars="-/.^&*_!@%=+>";
        String finalStr = letters + specialchars + numbers ;
        Random random = new Random();
        char[] password = new char[length];
        password[0]=letters.charAt(random.nextInt(letters.length()));
        password[1]=numbers.charAt(random.nextInt(numbers.length()));
        password[2]=specialchars.charAt(random.nextInt(specialchars.length()));
        for (int i = 3; i < length; i++) {
            password[i] = finalStr.charAt(random.nextInt(finalStr.length()));
        }
        String finalPass=  new String(password);
        return finalPass;

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
