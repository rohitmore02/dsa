public class IfElseStatements {

    public static void main(String args[]) {

//        int a = 30;
//
//        if (a > 25) {
//            System.out.println("a is greater than 25");
//        } else {
//            System.out.println("a is less than 25");
//        }

        int marks = 95;

        if (marks > 90) {
            System.out.println("A grade");
        } else if (marks > 75) {
            System.out.println("B grade");
        } else if (marks > 50) {
            System.out.println("C grade");
        } else {
            System.out.println("Failed");
        }
    }
}
