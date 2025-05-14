
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
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<i*2-1; j++) {
                System.out.print("*");
            }

            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pattern8(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=2*(n-i)+1; j++) {
                System.out.print("*");
            }

            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    void pattern10(int n) {
        for (int i=1; i<=(2*n-1); i++) {
            int stars = i;
            if (i > n) stars = 2*n - i;
            for (int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern11(int n) {
        for (int i=1; i<=n; i++) {
            int number = 1;

            if (i%2==0) number = 0;

            for (int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number = 1 - number;
            }

            System.out.println();
        }
    }

    void pattern12(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (j<=i) System.out.print(j);
                else System.out.print(" ");
            }

            for (int j=n; j>=1; j--) {
                if (j<=i) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern13(int n) {
        int number = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    void pattern14(int n) {
        for (int i=0; i<n; i++) {
            for (char ch='A'; ch<='A'+i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Patterns obj = new Patterns();

        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        obj.pattern14(num);
    }

}