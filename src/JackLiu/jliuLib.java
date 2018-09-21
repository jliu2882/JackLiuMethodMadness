package JackLiu;

public class jliuLib {
    // #1

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
    //isPalindrome will return true if the word is same backwards and forwward

    public static String cutOut(String mainStr, String subStr) {
        if(mainStr.contains(subStr)){
            return mainStr.substring(0,mainStr.indexOf(subStr)) + mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
        }
        else{
            return mainStr;
        }
    }
    //cutOut is a method that will take the first String, and cut out the first occurrence of the second string

    //I was implementing a better way using two variables, a and b which was equal to 1 and 1 and would change a to a+b, and b to a+b and would loop
    //However, I could not find the proper way to stop, and only realized it after I was done
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
    //the method tests the number to see if it is a number in the sequence, using a formula that just works

    public static void multiplicationTable (int base, int range){
        int n = 0;
        while(n<range+1) {
            System.out.println(n * base);
            n++;
        }
    }
    //the method prints the base multiplied by numbers from 0 to the range

    //I did an extra String one by accident so :)
    public static String dateStr(String str){
        return str.substring(3,5) + " - " + str.substring(0,2) + " - " + str.substring(6);
    }
    //this method is if you want to become british(?) also it changes the order of the date

    //#2
    public static void fooBarBaz(int num1) {
        for (int i = 1; i < num1+1; i ++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("baz");
            }
            else if(i%3 == 0) {
                System.out.println("foo");
            }
            else if(i%5 == 0) {
                System.out.println("bar");
            }
            else {
                System.out.println(i);
            }
        }
    }
    //this method prints out baz, foo, or bar depending on what the value is

    //EXTRA CREDIT!!
    //the first time i did this, all my files got erased :(
    public static int leastCommonMultiple(int num1, int num2, int num3){
        return lcm2(lcm2(num1,num2),num3);
    }
    //this takes the lcm of the 2nd and 3rd number and finds the lcm of that and num1
    //it works because math

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
