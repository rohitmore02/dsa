
import java.util.Scanner;

class Patterns {

    void pattern1(int num) {
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Patterns obj = new Patterns();

        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        obj.pattern3(num);
    }

}