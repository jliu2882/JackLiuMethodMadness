package JackLiu;

public class Main {

    public static void main(String[] args) {
        //the test cases are self-explanatory, I used these specific cases, because they all return a value that proves
        //the method works, however, this is not perfect proof, and therefore you can test out different values to see
        //if the method works properly

        System.out.println(jliuLib.isPalindrome("testset"));
        System.out.println("-----------------------------");
        System.out.println(jliuLib.cutOut("catatonic cat", "cat"));
        System.out.println("-----------------------------");
        System.out.println(jliuLib.isFibonacci(2));
        System.out.println("-----------------------------");
        jliuLib.multiplicationTable(3,4);
        System.out.println("-----------------------------");
        System.out.println(jliuLib.dateStr("09/20/2018"));
        System.out.println("-----------------------------");
        jliuLib.fooBarBaz(16);
        System.out.println("-----------------------------");
        System.out.println(jliuLib.leastCommonMultiple(2,2,2));
        System.out.println("-----------------------------");
        System.out.println(jliuLib.quadSolver(1,2,-24));
        System.out.println("-----------------------------");

    }
}
