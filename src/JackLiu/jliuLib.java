package JackLiu;

public class jliuLib {
    // #1

    /**
     * this method tests if the word is a palindrome
     * @param str the string is the word
     * @return true or false depending on it's a palindrome
     */
    public static boolean isPalindrome (String str) {
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.substring(i,i+1);
        }
        if(str.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * the method cuts the first string's occurence of the second string
     * @param mainStr this is the main word that we are cutting
     * @param subStr this is the word we are cutting off
     * @return returns the new word
     */
    public static String cutOut(String mainStr, String subStr) {
        if(mainStr.contains(subStr)){
            return mainStr.substring(0,mainStr.indexOf(subStr)) + mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
        }
        else{
            return mainStr;
        }
    }

    //I was implementing a better way using two variables, a and b which was equal to 1 and 1 and would change a to a+b, and b to a+b and would loop
    //However, I could not find the proper way to stop, and only realized it after I was done

    /**
     * the function tests if the number is in the sequence
     * @param num1 the number we are testing
     * @return it returns true of false, depending on the number
     */
    public static boolean isFibonacci(int num1){
        int code1 = 5*num1*num1 + 4;
        int code2 = 5*num1*num1 - 4;
        if((int)Math.sqrt(code1)*(int)Math.sqrt(code1) == code1){
            return true;
        }
        if((int)Math.sqrt(code2)*(int)Math.sqrt(code2) == code2){
            return true;
        }
        return false;
    }

    /**
     * the method produces a table with the number base and range in mind
     * @param base the number we are multiplying
     * @param range how far the number is multiplied by
     */
    public static void multiplicationTable (int base, int range){
        int n = 0;
        while(n<range+1) {
            System.out.println(n * base);
            n++;
        }
    }

    //I did an extra String one by accident so :)

    /**
     * the method returns a british-ished version of the date
     * @param str the date in the cool way :)
     * @return the new date
     */
    public static String dateStr(String str){
        return str.substring(3,5) + " - " + str.substring(0,2) + " - " + str.substring(6);
    }

    //#2

    /**
     * the method prints out an array of numbers replacing the multiplies of 3 and 5 with unique words
     * @param num1 the number we are going up to
     */
    public static void fooBarBaz(int num1) {
        for (int i = 1; i < num1+1; i ++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.print("baz" + " ");
            }
            else if(i%3 == 0) {
                System.out.print("foo" + " ");
            }
            else if(i%5 == 0) {
                System.out.print("bar" + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    //EXTRA CREDIT!!
    //the first time i did this, all my files got erased :(

    /**
     * takes the lcm of 3 numbers
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the lcm
     */
    public static int leastCommonMultiple(int num1, int num2, int num3){
        return lcm2(lcm2(num1,num2),num3);
    }
    //this takes the lcm of the 2nd and 3rd number and finds the lcm of that and num1
    //it works because math

    /**
     * takes the lcm of two numbers
     * @param num1 first number
     * @param num2 second number
     * @return the lcm
     */
    //I made this to make my life easier
    public static int lcm2(int num1, int num2){
        int test = 1;
        for(int i = 0; i<1; i = i){
            if(test % num1 == 0 && test % num2 == 0){
                i++;
            }
            else{
                test++;
            }
        }
        return test;
    }

    /**
     * solves your equations
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the roots or imaginary
     */
    public static String quadSolver(double a, double b, double c){
        double firstPart = b * -1;
        double secondPart = (b*b)-(4*a*c);
        double nextPart = 2*a;
        if(secondPart>=0){
            double root1 = (firstPart + Math.sqrt(secondPart))/nextPart;
            double root2 = (firstPart - Math.sqrt(secondPart))/nextPart;
            return String.valueOf(root1) + " and " + String.valueOf(root2) + " are the roots.";
        }
        else{
            return "The roots are imaginary";
        }

    }




}
