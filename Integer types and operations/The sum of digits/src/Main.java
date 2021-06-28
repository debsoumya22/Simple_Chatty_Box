import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit1 = (number / 1) % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int result;
        result = digit1 + digit2 + digit3;
        System.out.println(result);
        
    }
}
