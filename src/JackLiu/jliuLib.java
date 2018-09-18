package JackLiu;

public class jliuLib {

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

    public static String dateStr(String str){
        return str.substring(0,2) + " - " + str.substring(3,5) + " - " + str.substring(6);
    }

    public static String cutOut(String mainStr, String subStr) {
        if(mainStr.contains(subStr)){
            return mainStr.substring(0,mainStr.indexOf(subStr)) + mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
        }
        else{
            return mainStr;
        }
    }

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

    public static boolean isFibonacci(int num1){
        int fibonacciCheatCode1 = 5*num1*num1 //unfinished
        if((int)Math.sqrt(num1)*(int)Math.sqrt(num1) == num1){

        }
    }

}
