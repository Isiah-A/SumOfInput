import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter a Number:");
        int number = Integer.parseInt(in.nextLine());
        System.out.println(sumNumbers(number));


    }
    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}