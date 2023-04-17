public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public StringBuilder weakPassword(int length) {

        StringBuilder str = new StringBuilder(length);
        String lowerCase = "abcdefghijklmnopqrstuvxyz";

        for(int i = 0 ; i < length ; i++) {

            int ch = (int) (lowerCase.length() * Math.random());

            str.append(lowerCase.charAt(ch));

        }
        return str;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public StringBuilder strongPassword(int length) throws Exception {


        StringBuilder str = new StringBuilder(length);
        StringBuilder str2 = new StringBuilder(length);
        StringBuilder str3 = new StringBuilder(length);
        StringBuilder str4 = new StringBuilder(length);

        String word = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "?!@#$%^&*";
        String number = "1234567890";
        String all = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?!@#$%^&*1234567890";

        if(length >= 3 ){

            int ch = (int) (word.length() * Math.random());
            int ch1 = (int) (special.length() * Math.random());
            int ch2 = (int) (number.length() * Math.random());


            str.append(word.charAt(ch));
            str2.append(special.charAt(ch1));
            str3.append(number.charAt(ch2));


            System.out.print(str); System.out.print(str2); System.out.print(str3);
            length = length- 3;

        }

        for(int i = 0 ; i < length ; i++) {

            int ch3 =  (int) (all.length() * Math.random());
            str4.append(all.charAt(ch3));


        }
        return str4;
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

        int num1 = 0;
        int num2 = 1;
        while (num2 <= n) {
            int end = num1 + num2;
            if ((n - num2) == Integer.bitCount(end)) {
                return true;
            }
            num1 = num2;
            num2 = end;
        }
        return false;
    }
}
