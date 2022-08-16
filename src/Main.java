import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
         System.out.println("Enter a number:");
         int n=inp.nextInt();
        int i = 0, j = 0, k = 0;

        while (i <= n) {
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            while (k <= (2*i-1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
            j = 1;
            k = 1;
        }
    }
}

