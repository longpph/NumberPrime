import java.util.Scanner;

public class NumberPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = 2;
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Enter number: ");
        int numbers = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên: ", numbers);
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        scanner.close();
    }
}
