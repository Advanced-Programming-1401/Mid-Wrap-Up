public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String answer="";
        for(int i=0;i<length;i++){
            int random=(int)(alphabet.length() * Math.random());
            answer+=alphabet.charAt(random);
        }
        return answer;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        String specialChar="!@#$%&*^?";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String numbers="1234567890";
        String answer="";
        String answer2="";
        String all=specialChar+alphabet+numbers;
        int random1=(int)(specialChar.length() * Math.random());
        answer+=random1;
        int random2=(int)(numbers.length() * Math.random());
        answer+=random2;
        for(int i=2;i<length;i++){
            int random=(int)(all.length() * Math.random());
            answer+=all.charAt(random);
        }

        return answer;

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
