
import static java.lang.Math.log10;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class BasicMaths {

    void countDigits(int n) {
        int count = 0;
        // while (n > 0) {
        //     count++;
        //     n = n/10;
        // }

        count = (int)(log10(n) + 1);

        System.out.println(count);
    }

    void reverseNumber(int n) {
        int reverse = 0;
        
        while (n > 0) {
            int lastDigit  = n%10;
            n = n/10;

            reverse = reverse*10;
            reverse = reverse + lastDigit;
        }

        System.out.print(reverse);
    }

    void checkPalindrome(int n) {
        int reverse = 0;
        int dup = n;
        
        while (n > 0) {
           int lastDigit = n%10;
           n = n/10;

           reverse = reverse*10;
           reverse = reverse + lastDigit; 
        }

        if (reverse==dup) System.out.print(dup + " is a Palindrome Number");
        else System.out.print(dup + " is not a Palindrome Number");
    }

    void checkArmstrong(int n) {
        int armstrong = 0;
        int dup = n;
        int length = (int) Math.log10(n) + 1;

        while(n > 0) {
            int lastDigit = n%10;
            n = n/10;

            armstrong = armstrong + (int) Math.pow(lastDigit, length);
            System.out.println((int) Math.pow(lastDigit, length));
        }

        if (armstrong == dup) System.out.print(dup + " is an Armstrong Number");
        else System.out.print(dup + " is not an Armstrong Number");
    }

    void findDivisors(int n) {
        // Method - 1
        // for (int i=1; i<=n; i++) {
        //     if (n%i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        // Method - 2
        Vector<Integer> divisors = new Vector<Integer>();
        for (int i=1; i*i<=n; i++) {
            if (n%i == 0) {
                divisors.add(i);
                if ((n/i != i)) {
                    divisors.add(n/i);
                }
            }
        }

        Collections.sort(divisors);
        for (int e : divisors) System.out.print(e + " ");
    }

    void checkPrime(int n) {
        int count = 0;
        for (int i=1; i*i<=n; i++) {
            if (n%i ==0) {
                count++;
                if (n/i != i) count++;
            }
        }

        if (count <= 2) System.out.print(n + " is a Prime Number");
        else System.out.print(n + " is not a Prime Number");
    }

    void findGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }

        if (a==0) System.out.print(b + " is the GCD");
        else System.out.print(a + " is the GCD");
    }

    public static void main(String[] args) {
        BasicMaths obj = new BasicMaths();
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        obj.findGCD(num1, num2);
    }
}